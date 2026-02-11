package com.java.javacodingprograms.statics;
public class SumOfDigits {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of 12345: " + SumOfDigits.sum(12345));
    }
}