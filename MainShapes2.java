package com.java.javacodingprograms.Abstraction;
public class MainShapes2 {
    public static void main(String[] args) {
        Shape2 s1 = new Triangle();
        Shape2 s2 = new Circle1();

        s1.calculateArea();
        s1.calculatePerimeter();

        s2.calculateArea();
        s2.calculatePerimeter();
    }
}