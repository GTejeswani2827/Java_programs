package com.java.javacodingprograms.statics;
public class SquareArea {
    public static double area(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println("Area of square with side 5: " + SquareArea.area(5));
    }
}