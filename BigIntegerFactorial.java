package com.java.javacodingprograms.Datatypes;
import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        int num = 5;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial: " + fact);
    }
}