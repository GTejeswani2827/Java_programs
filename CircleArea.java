package com.java.javacodingprograms.statics;
public class CircleArea {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle with radius 5: " + CircleArea.area(5));
    }
}
