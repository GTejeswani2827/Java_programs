package com.javacode.javacodingprograms.project;
import java.util.Arrays;

public class KthElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        Arrays.sort(arr);
        System.out.println("Kth Smallest: " + arr[k - 1]);
        System.out.println("Kth Largest: " + arr[arr.length - k]);
    }
}
