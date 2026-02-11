package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diagonal1: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Enter diagonal2: ");
        double diagonal2 = scanner.nextDouble();
        double area = 0.5 * diagonal1 * diagonal2;
        System.out.println("Area: " + area);
    }
}

