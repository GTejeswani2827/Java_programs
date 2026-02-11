package com.java.javacodingprograms.Abstraction;
abstract class BankAccount2 {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAcc extends BankAccount2 {
    void deposit() {
        System.out.println("Savings deposit");
    }

    void withdraw() {
        System.out.println("Savings withdraw");
    }
}

class CurrentAcc extends BankAccount2 {
    void deposit() {
        System.out.println("Current deposit");
    }

    void withdraw() {
        System.out.println("Current withdraw");
    }
}