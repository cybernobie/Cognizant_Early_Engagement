package com.example.ExpenseManager.controller;

import com.example.ExpenseManager.model.Expense;
import com.example.ExpenseManager.service.ExpenseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasSize;


@WebMvcTest(ExpenseController.class)
public class ExpenseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExpenseService expenseService;

    private ObjectMapper objectMapper;
    private Expense expense1;
    private Expense expense2;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // For LocalDate serialization

        expense1 = new Expense("Expense 1", BigDecimal.valueOf(100.00), LocalDate.now(), "Category 1");
        expense1.setId(1L);
        expense2 = new Expense("Expense 2", BigDecimal.valueOf(200.00), LocalDate.now(), "Category 2");
        expense2.setId(2L);
    }

    @Test
    void testAddExpense() throws Exception {
        when(expenseService.saveExpense(any(Expense.class))).thenReturn(expense1);

        mockMvc.perform(post("/api/expenses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(expense1)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.description", is("Expense 1")))
                .andExpect(jsonPath("$.amount", is(100.00)));
    }

    @Test
    void testGetAllExpenses() throws Exception {
        List<Expense> expenses = Arrays.asList(expense1, expense2);
        when(expenseService.getAllExpenses()).thenReturn(expenses);

        mockMvc.perform(get("/api/expenses"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].description", is("Expense 1")))
                .andExpect(jsonPath("$[1].description", is("Expense 2")));
    }

    @Test
    void testGetExpenseById_Found() throws Exception {
        when(expenseService.getExpenseById(1L)).thenReturn(Optional.of(expense1));

        mockMvc.perform(get("/api/expenses/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description", is("Expense 1")));
    }

    @Test
    void testGetExpenseById_NotFound() throws Exception {
        when(expenseService.getExpenseById(3L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/api/expenses/3"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testUpdateExpense_Found() throws Exception {
        Expense updatedExpenseDetails = new Expense("Updated Expense", BigDecimal.valueOf(150.00), LocalDate.now(), "Updated Category");
        
        // Mock getExpenseById to return an existing expense
        when(expenseService.getExpenseById(1L)).thenReturn(Optional.of(expense1));
        // Mock saveExpense to return the updated expense
        when(expenseService.saveExpense(any(Expense.class))).thenAnswer(invocation -> {
            Expense ex = invocation.getArgument(0);
            // Ensure the ID from the path is used and other fields are updated
            ex.setId(1L); 
            return ex;
        });


        mockMvc.perform(put("/api/expenses/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedExpenseDetails)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description", is("Updated Expense")))
                .andExpect(jsonPath("$.amount", is(150.00)));
    }
    
    @Test
    void testUpdateExpense_NotFound() throws Exception {
        Expense updatedExpenseDetails = new Expense("Updated Expense", BigDecimal.valueOf(150.00), LocalDate.now(), "Updated Category");
        when(expenseService.getExpenseById(3L)).thenReturn(Optional.empty());

        mockMvc.perform(put("/api/expenses/3")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedExpenseDetails)))
                .andExpect(status().isNotFound());
    }

    @Test
    void testDeleteExpense() throws Exception {
        doNothing().when(expenseService).deleteExpense(1L);

        mockMvc.perform(delete("/api/expenses/1"))
                .andExpect(status().isNoContent());
    }
    
    @Test
    void testDeleteExpense_NotFound() throws Exception {
        // Mocking the service layer to simulate that no expense with ID 3L exists,
        // which might lead to an exception or specific handling in a real scenario.
        // For deleteById, it typically doesn't throw if not found, but good to be aware.
        // JpaRepository's deleteById doesn't throw if not found.
        doNothing().when(expenseService).deleteExpense(3L);

        mockMvc.perform(delete("/api/expenses/3"))
                .andExpect(status().isNoContent()); // HTTP 204 is often returned even if resource didn't exist
    }


    @Test
    void testGetTotalExpenses() throws Exception {
        when(expenseService.calculateTotalExpenses()).thenReturn(BigDecimal.valueOf(300.00));

        mockMvc.perform(get("/api/expenses/total"))
                .andExpect(status().isOk())
                .andExpect(content().string("300.0")); // Check for plain string representation of BigDecimal
    }
}
