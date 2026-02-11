package com.java.javacodingprograms.statics;
public class ParallelogramArea {
    public static double area(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of parallelogram with base 5 and height 10: " + ParallelogramArea.area(5, 10));
    }
}
