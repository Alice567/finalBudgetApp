package org.fasttrackit.budgetapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.budgetapp.model.Budget;
import org.fasttrackit.budgetapp.model.Info;
import org.fasttrackit.budgetapp.service.BudgetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.fasttrackit.budgetapp.model.Account.CARD;
import static org.fasttrackit.budgetapp.model.Account.CASH;
import static org.fasttrackit.budgetapp.model.Type.EXPENSE;
import static org.fasttrackit.budgetapp.model.Type.INCOME;


    @Component
    @RequiredArgsConstructor
    @Slf4j
    public class CommandRunner implements CommandLineRunner {
        private final BudgetService service;
        @Override
        public void run(String... args) {
            log.info("Runner is populating with data");
            service.addAllBudgets(
                    List.of(
                            Budget.builder()
                                    .type(INCOME)
                                    .account(CASH)
                                    .amount(120000.0)
                                    .info(Info.builder()
                                            .product("Economies")
                                            .description("Total economies")
                                            .build())
                                    .build(),

                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CASH)
                                    .amount(299.10)
                                    .info(Info.builder()
                                            .product("Electricity")
                                            .description("Electricity payed for 2 months")
                                            .build())
                                    .build(),

                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CASH)
                                    .amount(100.90)
                                    .info(Info.builder()
                                            .product("Present")
                                            .description("For Mother's Day")
                                            .build())
                                    .build(),

                            Budget.builder()
                                    .type(INCOME)
                                    .account(CARD)
                                    .amount(6000.0)
                                    .info(Info.builder()
                                            .product("Paycheck")
                                            .description("March")
                                            .build())
                                    .build(),

                            Budget.builder()
                                    .type(INCOME)
                                    .account(CARD)
                                    .amount(100.0)
                                    .info(Info.builder()
                                            .product("Paycheck")
                                            .description("Present for Spring Break")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(400.0)
                                    .info(Info.builder()
                                            .product("Utilities")
                                            .description("Payed for this month")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(8.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Spaghetti")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(7.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Milk")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(12.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Apples")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(60.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Pizza")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(5.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Banana")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(20.0)
                                    .info(Info.builder()
                                            .product("Food")
                                            .description("Soup")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(7.0)
                                    .info(Info.builder()
                                            .product("Drink")
                                            .description("Cola")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(7.0)
                                    .info(Info.builder()
                                            .product("Drink")
                                            .description("Pepsi")
                                            .build())
                                    .build(),
                            Budget.builder()
                                    .type(EXPENSE)
                                    .account(CARD)
                                    .amount(6.0)
                                    .info(Info.builder()
                                            .product("Drink")
                                            .description("Fanta")
                                            .build())
                                    .build()

                    ));
        }
    }

