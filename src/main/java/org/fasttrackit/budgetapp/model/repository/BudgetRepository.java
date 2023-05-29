package org.fasttrackit.budgetapp.model.repository;


import org.fasttrackit.budgetapp.model.Budget;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface BudgetRepository extends JpaRepository<Budget, Integer> {




}
