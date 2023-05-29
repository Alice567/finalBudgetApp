package org.fasttrackit.budgetapp.service;
import org.fasttrackit.budgetapp.ResourceNotFoundException;
import org.fasttrackit.budgetapp.model.Budget;
import org.fasttrackit.budgetapp.model.dto.BudgetDTO;
import org.fasttrackit.budgetapp.model.dto.BudgetMapper;
import org.fasttrackit.budgetapp.model.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public void addAllBudgets(List<Budget> budgets) {
        budgetRepository.saveAll(budgets);
    }

    public List<BudgetDTO> getAllBudgets() {
        return budgetRepository.findAll().stream()
                .map(BudgetMapper::toDto)
                .toList();
    }

    public BudgetDTO getBudgetById(String id) {
        return BudgetMapper.toDto(budgetRepository.findById(Integer.valueOf(id))
                .orElseThrow(() -> new ResourceNotFoundException("Budget with id %s was not found".formatted(id))));
    }

    public Budget findBudgetById(Integer id) {
        return budgetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Budget with id %s was not found".formatted(id)));
    }

    public BudgetDTO createNewBudget(BudgetDTO newBudget) {
        return BudgetMapper.toDto(budgetRepository.save(BudgetMapper.toEntity(newBudget)));
    }

    public String deleteBudgetById(String id) {
        String response = String.valueOf(getBudgetById(id).type());
        budgetRepository.deleteById(Integer.valueOf(id));
        return ("Budget: " + response + " was deleted!");
    }

    public BudgetDTO updateBudget(String id, BudgetDTO updatedBudget) {
        Budget initialBudget = BudgetMapper.toEntity(getBudgetById(id));
        initialBudget.setType(updatedBudget.type());
        initialBudget.setAmount(updatedBudget.value());
        initialBudget.setAccount(updatedBudget.account());
        initialBudget.setInfo(updatedBudget.info());
        return BudgetMapper.toDto(budgetRepository.save(initialBudget));
    }
}





