package com.java.javacodingprograms.Abstraction;
abstract class Shapes2 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle1 extends Shape2 {
    void calculateArea() {
        System.out.println("Area of Triangle");
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of Triangle");
    }
}

class Circle1 extends Shape2 {
    void calculateArea() {
        System.out.println("Area of Circle");
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of Circle");
    }
}