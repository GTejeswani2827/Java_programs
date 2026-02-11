package com.java.javacodingprograms.Abstraction;
abstract class Bank2 {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank1 extends Bank {
    void openAccount() {
        System.out.println("Savings Account Opened");
    }
    void closeAccount() {
        System.out.println("Savings Account Closed");
    }
}

class CurrentBank1 extends Bank {
    void openAccount() {
        System.out.println("Current Account Opened");
    }
    void closeAccount() {
        System.out.println("Current Account Closed");
    }
}