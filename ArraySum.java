package com.java.javacodingprograms.statics;
public class ArraySum {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + ArraySum.sum(arr));
    }
}
