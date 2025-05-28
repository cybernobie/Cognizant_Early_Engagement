package com.example.ExpenseManager.controller;

import com.example.ExpenseManager.model.Expense;
import com.example.ExpenseManager.service.ExpenseService;
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
import java.util.Collections;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(ExpenseWebController.class)
public class ExpenseWebControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExpenseService expenseService;

    private Expense expense1;

    @BeforeEach
    void setUp() {
        expense1 = new Expense("Test Expense", BigDecimal.valueOf(50.00), LocalDate.now(), "Test Category");
        expense1.setId(1L);
    }

    @Test
    void testShowExpensesPage() throws Exception {
        when(expenseService.getAllExpenses()).thenReturn(Arrays.asList(expense1));
        when(expenseService.calculateTotalExpenses()).thenReturn(BigDecimal.valueOf(50.00));

        mockMvc.perform(get("/expenses"))
                .andExpect(status().isOk())
                .andExpect(view().name("expenses"))
                .andExpect(model().attribute("expenses", hasSize(1)))
                .andExpect(model().attribute("expenses", contains(expense1)))
                .andExpect(model().attribute("totalExpenses", is(BigDecimal.valueOf(50.00))));
    }

    @Test
    void testShowAddExpenseForm() throws Exception {
        mockMvc.perform(get("/expenses/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("expense-form"))
                .andExpect(model().attribute("expense", instanceOf(Expense.class)))
                .andExpect(model().attribute("expense", hasProperty("id", nullValue())));
    }

    @Test
    void testShowEditExpenseForm_Found() throws Exception {
        when(expenseService.getExpenseById(1L)).thenReturn(Optional.of(expense1));

        mockMvc.perform(get("/expenses/edit/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("expense-form"))
                .andExpect(model().attribute("expense", expense1));
    }

    @Test
    void testShowEditExpenseForm_NotFound() throws Exception {
        when(expenseService.getExpenseById(2L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/expenses/edit/2"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/expenses"));
    }

    @Test
    void testSaveExpense_Valid() throws Exception {
        when(expenseService.saveExpense(any(Expense.class))).thenReturn(expense1);

        mockMvc.perform(post("/expenses/save")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "New Expense")
                .param("amount", "123.45")
                .param("date", "2024-01-15")
                .param("category", "Food")
                // .flashAttr("expense", new Expense("New Expense", BigDecimal.valueOf(123.45), LocalDate.parse("2024-01-15"), "Food")) // Alternative to .param()
                )
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/expenses"));
    }
    
    @Test
    void testSaveExpense_Invalid_DescriptionBlank() throws Exception {
        // No need to mock saveExpense as it shouldn't be called if validation fails
        mockMvc.perform(post("/expenses/save")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "") // Invalid: blank description
                .param("amount", "123.45")
                .param("date", "2024-01-15")
                .param("category", "Food"))
                .andExpect(status().isOk()) // Returns to form
                .andExpect(view().name("expense-form"))
                .andExpect(model().hasErrors())
                .andExpect(model().attributeHasFieldErrorCode("expense", "description", "NotBlank"));
    }

    @Test
    void testSaveExpense_Invalid_AmountNull() throws Exception {
        mockMvc.perform(post("/expenses/save")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "Valid Description")
                // Amount is missing - will be null
                .param("date", "2024-01-15")
                .param("category", "Food"))
                .andExpect(status().isOk())
                .andExpect(view().name("expense-form"))
                .andExpect(model().hasErrors())
                .andExpect(model().attributeHasFieldErrorCode("expense", "amount", "NotNull"));
    }
    
    @Test
    void testSaveExpense_Invalid_AmountTooSmall() throws Exception {
        mockMvc.perform(post("/expenses/save")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "Valid Description")
                .param("amount", "0.00") // Invalid: amount must be > 0.01
                .param("date", "2024-01-15")
                .param("category", "Food"))
                .andExpect(status().isOk())
                .andExpect(view().name("expense-form"))
                .andExpect(model().hasErrors())
                .andExpect(model().attributeHasFieldErrorCode("expense", "amount", "DecimalMin"));
    }

    @Test
    void testSaveExpense_Invalid_DateFuture() throws Exception {
        LocalDate futureDate = LocalDate.now().plusDays(1);
        mockMvc.perform(post("/expenses/save")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "Valid Description")
                .param("amount", "10.00")
                .param("date", futureDate.toString()) // Invalid: date in future
                .param("category", "Travel"))
                .andExpect(status().isOk())
                .andExpect(view().name("expense-form"))
                .andExpect(model().hasErrors())
                .andExpect(model().attributeHasFieldErrorCode("expense", "date", "PastOrPresent"));
    }


    @Test
    void testDeleteExpensePage() throws Exception {
        // Mock the service layer. deleteExpense returns void.
        // doNothing().when(expenseService).deleteExpense(anyLong()); // Not strictly needed for void methods unless verifying calls

        mockMvc.perform(get("/expenses/delete/1"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/expenses"));
    }
}
