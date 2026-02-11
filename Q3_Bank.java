package com.java.javacodingprograms.Encapsulations;
class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

public class Q3_Bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(111);
        b.deposit(5000);
        b.withdraw(1000);

        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
    }
}