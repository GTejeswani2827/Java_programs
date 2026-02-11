package com.java.javacodingprograms.Abstraction;
public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s1.calculatePerimeter();

        s2.calculateArea();
        s2.calculatePerimeter();
    }
}