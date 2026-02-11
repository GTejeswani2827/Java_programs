package com.java.javacodingprograms.Inheritannce;
class BAccount {
    int accNo;
    double balance;
}

class SaveAccount extends BAccount {
}

public class Q12_BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accNo = 111;
        s.balance = 8000;

        System.out.println(s.accNo);
        System.out.println(s.balance);
    }
}