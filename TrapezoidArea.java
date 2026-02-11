package com.java.javacodingprograms.statics;
public class TrapezoidArea {
    public static double area(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of trapezoid with bases 5 and 10, and height 5: " + TrapezoidArea.area(5, 10, 5));
    }
}
