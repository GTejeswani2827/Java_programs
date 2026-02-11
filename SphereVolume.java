package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double volume = (4 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume: " + volume);
    }
}