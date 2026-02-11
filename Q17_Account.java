package com.java.javacodingprograms.Encapsulations;
class Account {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Q17_Account {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountNumber(222);
        a.setBalance(8000);

        System.out.println(a.getBalance());
    }
}
