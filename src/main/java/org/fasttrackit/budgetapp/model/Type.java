package org.fasttrackit.budgetapp.model;

public enum Type {
    EXPENSE,
    INCOME;
    public String toString(){
        switch (this) {
            case EXPENSE: return "Expense";
            case INCOME: return "Income";
        }
        return null;
}
}