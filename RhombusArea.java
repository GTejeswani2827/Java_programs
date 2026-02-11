package com.java.javacodingprograms.statics;
public class RhombusArea {
    public static double area(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public static void main(String[] args) {
        System.out.println("Area of rhombus with diagonals 5 and 10: " + RhombusArea.area(5, 10));
    }
}