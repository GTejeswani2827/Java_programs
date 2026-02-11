package com.java.javacodingprograms.statics;
public class PowerRecursion {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("2^3: " + PowerRecursion.power(2, 3));
    }
}
