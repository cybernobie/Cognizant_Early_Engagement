package com.example.ExpenseManager.service;

import com.example.ExpenseManager.model.Expense;
import com.example.ExpenseManager.repository.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExpenseServiceTest {

    @Mock
    private ExpenseRepository expenseRepository;

    @InjectMocks
    private ExpenseService expenseService;

    private Expense expense1;
    private Expense expense2;

    @BeforeEach
    void setUp() {
        expense1 = new Expense("Expense 1", BigDecimal.valueOf(100.00), LocalDate.now(), "Category 1");
        expense1.setId(1L);
        expense2 = new Expense("Expense 2", BigDecimal.valueOf(200.00), LocalDate.now(), "Category 2");
        expense2.setId(2L);
    }

    @Test
    void testSaveExpense() {
        when(expenseRepository.save(any(Expense.class))).thenReturn(expense1);
        Expense savedExpense = expenseService.saveExpense(expense1);
        assertNotNull(savedExpense);
        assertEquals("Expense 1", savedExpense.getDescription());
        verify(expenseRepository, times(1)).save(expense1);
    }

    @Test
    void testGetAllExpenses() {
        List<Expense> expenses = Arrays.asList(expense1, expense2);
        when(expenseRepository.findAll()).thenReturn(expenses);
        List<Expense> result = expenseService.getAllExpenses();
        assertEquals(2, result.size());
        verify(expenseRepository, times(1)).findAll();
    }

    @Test
    void testGetExpenseById_Found() {
        when(expenseRepository.findById(1L)).thenReturn(Optional.of(expense1));
        Optional<Expense> result = expenseService.getExpenseById(1L);
        assertTrue(result.isPresent());
        assertEquals("Expense 1", result.get().getDescription());
        verify(expenseRepository, times(1)).findById(1L);
    }

    @Test
    void testGetExpenseById_NotFound() {
        when(expenseRepository.findById(3L)).thenReturn(Optional.empty());
        Optional<Expense> result = expenseService.getExpenseById(3L);
        assertFalse(result.isPresent());
        verify(expenseRepository, times(1)).findById(3L);
    }

    @Test
    void testDeleteExpense() {
        doNothing().when(expenseRepository).deleteById(1L);
        expenseService.deleteExpense(1L);
        verify(expenseRepository, times(1)).deleteById(1L);
    }

    @Test
    void testCalculateTotalExpenses_WithExpenses() {
        List<Expense> expenses = Arrays.asList(expense1, expense2);
        when(expenseRepository.findAll()).thenReturn(expenses);
        BigDecimal total = expenseService.calculateTotalExpenses();
        assertEquals(BigDecimal.valueOf(300.00), total);
        verify(expenseRepository, times(1)).findAll();
    }

    @Test
    void testCalculateTotalExpenses_NoExpenses() {
        when(expenseRepository.findAll()).thenReturn(Collections.emptyList());
        BigDecimal total = expenseService.calculateTotalExpenses();
        assertEquals(BigDecimal.ZERO, total);
        verify(expenseRepository, times(1)).findAll();
    }
}
