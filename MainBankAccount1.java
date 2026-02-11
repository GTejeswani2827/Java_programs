package com.java.javacodingprograms.Abstraction;
public class MainBankAccount1 {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount();
        BankAccount a2 = new CurrentAccount();

        a1.deposit();
        a1.withdraw();

        a2.deposit();
        a2.withdraw();
    }
}

