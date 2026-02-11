package com.java.javacodingprograms.Abstraction;
public class MainBank {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new CurrentAccount();

        b1.deposit();
        b1.withdraw();

        b2.deposit();
        b2.withdraw();
    }
}