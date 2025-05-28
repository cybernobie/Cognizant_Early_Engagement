package com.example.ExpenseManager.controller;

import com.example.ExpenseManager.model.Expense;
import com.example.ExpenseManager.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/expenses") // Base path for web interface
public class ExpenseWebController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseWebController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public String getAllExpenses(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        model.addAttribute("totalExpenses", expenseService.calculateTotalExpenses());
        return "expenses"; // Renders expenses.html
    }

    @GetMapping("/new")
    public String showAddExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "expense-form"; // Renders expense-form.html for adding
    }

    @GetMapping("/edit/{id}")
    public String showEditExpenseForm(@PathVariable Long id, Model model) {
        Optional<Expense> expense = expenseService.getExpenseById(id);
        if (expense.isPresent()) {
            model.addAttribute("expense", expense.get());
            return "expense-form"; // Renders expense-form.html for editing
        } else {
            return "redirect:/expenses"; // Or an error page
        }
    }

    @PostMapping("/save")
    public String saveExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            // If there are errors, return to the form page to display them
            // The 'expense' object with its current values and errors will be passed back
            model.addAttribute("expense", expense); // Ensure the current expense object is passed back
            // It's good practice to also pass the bindingResult if you want to access it directly in Thymeleaf,
            // though th:errors automatically uses it if the object name matches (e.g. "expense")
            // model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "expense", bindingResult);
            return "expense-form";
        }
        expenseService.saveExpense(expense);
        return "redirect:/expenses";
    }

    // Note: Deletion will be handled by scripts.js calling the REST API
    // However, a GET mapping for deletion could be added here if not using JS for it.
    // For example:
    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
}
