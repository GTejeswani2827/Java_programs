package com.java.javacodingprograms.Encapsulations;
class BankAccount5 {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

public class Q25_BankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(101);
        b.deposit(5000);
        b.withdraw(2000);

        System.out.println(b.getBalance());
    }
}