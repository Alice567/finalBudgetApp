package org.fasttrackit.budgetapp.model.dto;

import lombok.Builder;
import org.fasttrackit.budgetapp.model.Account;
import org.fasttrackit.budgetapp.model.Info;
import org.fasttrackit.budgetapp.model.Type;

@Builder(toBuilder = true)
public record BudgetDTO (
        Integer id,
        Type type,
        Account account,
        Double value,
        Info info

)  {

}