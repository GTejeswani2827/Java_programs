package com.java.javacodingprograms.Abstraction;
abstract class BankAccount1 {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount2 extends BankAccount {
    void deposit() {
        System.out.println("Deposit in Savings Account");
    }
    void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount2 extends BankAccount {
    void deposit() {
        System.out.println("Deposit in Current Account");
    }
    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}