package com.java.javacodingprograms.statics;
public class SimpleInterest {
    public static double interest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        System.out.println("Simple interest: " + SimpleInterest.interest(1000, 5, 2));
    }
}