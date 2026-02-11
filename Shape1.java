package com.java.javacodingprograms.Abstraction;
abstract class Shape1 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Rectangle1 extends Shape {
    void calculateArea() {
        System.out.println("Area of Rectangle");
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle");
    }
}

class Square extends Shape {
    void calculateArea() {
        System.out.println("Area of Square");
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of Square");
    }
}