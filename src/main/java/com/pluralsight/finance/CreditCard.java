package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public CreditCard(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
    public void pay(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal getValue() {
        return balance.negate();
    }
}