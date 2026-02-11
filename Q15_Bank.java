package com.java.javacodingprograms.Encapsulations;
class BankAccount4 {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Q15_Bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(111);
        b.deposit(6000);

        System.out.println(b.getBalance());
    }
}