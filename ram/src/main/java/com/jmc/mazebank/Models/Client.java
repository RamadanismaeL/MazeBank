package com.jmc.mazebank.Models;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Account> checkingAccount;
    private final ObjectProperty<Account> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String fName, String lName, String pAddress, Account cAccount, Account sAccount, LocalDate date) {
        this.firstName = new SimpleStringProperty(this, "First ame", fName);
        this.lastName = new SimpleStringProperty(this, "Last Name", lName);
        this.payeeAddress = new SimpleStringProperty(this, "Payee Address", pAddress);
        this.checkingAccount = new SimpleObjectProperty<>(this, "Checking Account", cAccount);
        this.savingsAccount = new SimpleObjectProperty<>(this, "Savings Account", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "Date", date);
    }

    @SuppressWarnings("exports")
    public StringProperty firstNameProperty() {return this.firstName;}   
    @SuppressWarnings("exports")
    public StringProperty lastNamProperty() {return this.lastName;}
    @SuppressWarnings("exports")
    public StringProperty pAddressProperty() {return this.payeeAddress;}
    public ObjectProperty<Account> checkingAccountProperty() {return this.checkingAccount;}
    public ObjectProperty<Account> savingsAccountProperty() {return this.savingsAccount;}
    public ObjectProperty<LocalDate> dateProperty() {return this.dateCreated;}
}
