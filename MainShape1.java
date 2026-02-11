package com.java.javacodingprograms.Abstraction;
public class MainShape1 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Square();

        s1.calculateArea();
        s1.calculatePerimeter();

        s2.calculateArea();
        s2.calculatePerimeter();
    }
}