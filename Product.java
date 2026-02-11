package com.javacode.javacodingprograms.project;
public class Product {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }
}