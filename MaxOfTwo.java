package com.java.javacodingprograms.statics;
public class MaxOfTwo {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 5 and 10: " + MaxOfTwo.max(5, 10));
    }
}
