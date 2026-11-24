package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", 122, new BigDecimal("12500"));
        Valuable account2 = new BankAccount("Gary", 123, new BigDecimal("1500"));

        // try to deposit money into both accounts
        account1.deposit(BigDecimal.valueOf(100));
        //account2.deposit(BigDecimal.valueOf(100));
    }
}
