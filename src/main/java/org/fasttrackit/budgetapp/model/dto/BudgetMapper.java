package org.fasttrackit.budgetapp.model.dto;

import org.fasttrackit.budgetapp.model.Budget;
import org.springframework.stereotype.Component;

@Component
public class BudgetMapper {

    public static BudgetDTO toDto(Budget entity){
        return BudgetDTO.builder()
                .id(entity.getId())
                .type(entity.getType())
                .value(entity.getAmount())
                .info(entity.getInfo())
                .account(entity.getAccount())
                .build();

    }
    public static Budget toEntity(BudgetDTO budgetDTO){
        return Budget.builder()
                .id(budgetDTO.id())
                .type(budgetDTO.type())
                .amount(budgetDTO.value())
                .info(budgetDTO.info())
                .account(budgetDTO.account())
                .build();
    }
}
