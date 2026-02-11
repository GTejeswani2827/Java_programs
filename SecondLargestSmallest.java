package com.javacode.javacodingprograms.project;
import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
        System.out.println("Second Smallest: " + arr[1]);
    }
}
