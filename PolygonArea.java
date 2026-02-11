package com.java.javacodingprograms.statics;
public class PolygonArea {
    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        System.out.println("Area of regular hexagon with side 5: " + PolygonArea.area(6, 5));
    }
}
