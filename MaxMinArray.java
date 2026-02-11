package com.java.javacodingprograms.Datatypes;
public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}