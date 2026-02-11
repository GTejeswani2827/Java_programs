package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base1: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter base2: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area: " + area);
    }
}