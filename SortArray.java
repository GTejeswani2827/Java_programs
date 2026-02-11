package com.javacode.javacodingprograms.project;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr);
        System.out.println("Sorted Array (Ascending): ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Descending order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

