package com.java.javacodingprograms.Abstraction;
public class MainBank1 {
    public static void main(String[] args) {
        Bank b1 = new SavingsBank();
        Bank b2 = new CurrentBank();

        b1.openAccount();
        b1.closeAccount();

        b2.openAccount();
        b2.closeAccount();
    }
}