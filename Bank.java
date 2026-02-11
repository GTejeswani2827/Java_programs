package com.java.javacodingprograms.Abstraction;
abstract class Bank {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank extends Bank {
    void openAccount() {
        System.out.println("Savings account opened");
    }

    void closeAccount() {
        System.out.println("Savings account closed");
    }
}

class CurrentBank extends Bank {
    void openAccount() {
        System.out.println("Current account opened");
    }

    void closeAccount() {
        System.out.println("Current account closed");
    }
}