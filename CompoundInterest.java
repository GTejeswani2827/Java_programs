package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time: ");
        double time = scanner.nextDouble();
        double ci = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound Interest: " + ci);
    }
}