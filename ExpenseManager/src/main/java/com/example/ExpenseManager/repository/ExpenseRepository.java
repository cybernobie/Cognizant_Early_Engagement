package com.example.ExpenseManager.repository;

import com.example.ExpenseManager.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // No additional methods are required for now
}
