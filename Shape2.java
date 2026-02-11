package com.java.javacodingprograms.Abstraction;
abstract class Shape2 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle extends Shape2 {
    void calculateArea() {
        System.out.println("Area of Triangle calculated");
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Triangle calculated");
    }
}

class Circle2 extends Shape2 {
    void calculateArea() {
        System.out.println("Area of Circle calculated");
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Circle calculated");
    }
}