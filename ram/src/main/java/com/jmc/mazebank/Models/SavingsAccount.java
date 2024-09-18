package com.jmc.mazebank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount  extends Account {
    private final DoubleProperty withdrawlLimit;

    public SavingsAccount(String owner, String accountNumber, double balance, double withdrawlLimit) {
        super(owner, accountNumber, balance);
        this.withdrawlLimit = new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawlLimit);
    }

    @SuppressWarnings("exports")
    public DoubleProperty withdrawlLimitProperty() {return this.withdrawlLimit;}
}
