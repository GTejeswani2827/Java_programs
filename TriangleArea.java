package com.java.javacodingprograms.statics;
public class TriangleArea {
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of triangle with base 5 and height 10: " + TriangleArea.area(5, 10));
    }
}
