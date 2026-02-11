package com.java.javacodingprograms.Inheritannce;
class Shape8 {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle2 extends Shape {
    void showCircle() {
        System.out.println("This is a Circle");
    }
}

class Rectangle5 extends Shape {
    void showRectangle() {
        System.out.println("This is a Rectangle");
    }
}

public class Q4_InheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();        // base class method
        c.showCircle1();     // derived class method

        Rectangle r = new Rectangle();
        r.display();        // base class method
        r.showRectangle();  // derived class method
    }
}