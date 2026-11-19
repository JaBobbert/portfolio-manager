package com.pluralsight.finance;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal(("12500")));
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal("1500"));

        account1.deposit(BigDecimal.valueOf(100));
        //account2.deposit(BigDecimal.valueOf(100));
    }
}
