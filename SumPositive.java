package com.javacode.javacodingprograms.project;
public class SumPositive {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5};
        int sum = 0;
        for (int i : arr) {
            if (i > 0) sum += i;
        }
        System.out.println("Sum of Positive Numbers: " + sum);
    }
}
