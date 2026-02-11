package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("Area: " + area);
    }
}