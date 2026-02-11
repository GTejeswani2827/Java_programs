package com.java.javacodingprograms.Abstraction;
abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class Rect extends Figure {
    void draw() {
        System.out.println("Rectangle drawn");
    }

    void erase() {
        System.out.println("Rectangle erased");
    }
}

class Circ extends Figure {
    void draw() {
        System.out.println("Circle drawn");
    }

    void erase() {
        System.out.println("Circle erased");
    }
}