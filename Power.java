package com.java.javacodingprograms.statics;
public class Power {
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println("2^3: " + Power.power(2, 3));
    }
}