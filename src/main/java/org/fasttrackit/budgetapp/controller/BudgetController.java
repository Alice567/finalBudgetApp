package org.fasttrackit.budgetapp.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.budgetapp.model.dto.BudgetDTO;
import org.fasttrackit.budgetapp.service.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("budgets")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(value = "http://localhost:4200")
public class BudgetController {
    private final BudgetService service;

    @GetMapping
    public List<BudgetDTO> getAllBudgets() {
        log.info("GET all budgets was called");
        return service.getAllBudgets();
    }

    @GetMapping("{id}")
    public BudgetDTO getBudgetById(@PathVariable String id) {
        log.info("GET budget by id was called");
        return service.getBudgetById(id);
    }

    @PostMapping
    public BudgetDTO createNewBudget(@RequestBody BudgetDTO newBudget) {
        log.info("POST: Create new budget was called");
        return service.createNewBudget(newBudget);
    }

    @PutMapping("{id}")
    public BudgetDTO updateBudget(@PathVariable String id, @RequestBody BudgetDTO updatedBudget) {
        log.info("PUT: Update budget was called");
        return service.updateBudget(id, updatedBudget);
    }

    @DeleteMapping("{id}")
    public String deleteBudgetById(@PathVariable String id) {
        log.info("DELETE budget by id was called");
        return service.deleteBudgetById(id);
    }
}