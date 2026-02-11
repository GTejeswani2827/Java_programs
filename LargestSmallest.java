package com.javacode.javacodingprograms.project;
public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}

