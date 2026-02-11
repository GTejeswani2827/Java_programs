package com.java.javacodingprograms.Abstraction;
abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposit in Savings Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposit in Current Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}