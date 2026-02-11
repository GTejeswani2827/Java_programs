package com.javacode.javacodingprograms.project;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] unique = Arrays.stream(arr).distinct().toArray();
        System.out.println("Unique Array: ");
        for (int i : unique) {
            System.out.print(i + " ");
        }
    }
}