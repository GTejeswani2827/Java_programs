package com.java.javacodingprograms.Inheritannce;
class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
	public int accNo;
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;
}

public class Q11_Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 123;
        s.balance = 5000;
        s.interestRate = 4.5;

        System.out.println(s.accountNumber);
        System.out.println(s.balance);
        System.out.println(s.interestRate);
    }
}