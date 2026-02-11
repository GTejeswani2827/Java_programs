package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double sqrt = Math.sqrt(num);
        System.out.println("Square Root: " + sqrt);
    }
}