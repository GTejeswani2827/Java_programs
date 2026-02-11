package com.java.javacodingprograms.statics;
public class CompoundInterest {
    public static double interest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public static void main(String[] args) {
        System.out.println("Compound interest: " + CompoundInterest.interest(1000, 5, 2));
    }
}