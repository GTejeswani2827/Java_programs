package com.java.javacodingprograms.statics;
public class RectangleArea {
    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle with length 5 and width 10: " + RectangleArea.area(5, 10));
    }
}