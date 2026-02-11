package com.java.javacodingprograms.Abstraction;
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    int r = 5;

    void calculateArea() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 6;

    void calculateArea() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
    }
}