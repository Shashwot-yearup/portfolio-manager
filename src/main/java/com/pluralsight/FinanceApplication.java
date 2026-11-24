package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Portfolio;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio();

        BankAccount account1 = new BankAccount("Pam", 122, new BigDecimal("12500"));
        BankAccount account2 = new BankAccount("Gary", 123, new BigDecimal("1500"));

        // try to deposit money into both accounts
        account1.deposit(BigDecimal.valueOf(100));
        account2.deposit(BigDecimal.valueOf(100));

        portfolio.addToItems(account1);
        portfolio.addToItems(account2);

        System.out.println("Most valuable: $" + portfolio.getMostValuable().getValue());
        System.out.println("Least valuable: $" + portfolio.getLeastValuable().getValue());

        System.out.println("The total value is: $" + portfolio.getTotalValue());

    }
}
