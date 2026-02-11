package com.java.javacodingprograms.Overloading;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;
        System.out.println("Average: " + average);
    }
}

