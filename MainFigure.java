package com.java.javacodingprograms.Abstraction;
public class MainFigure {
    public static void main(String[] args) {
        Figure f1 = new Rect();
        Figure f2 = new Circ();

        f1.draw();
        f1.erase();

        f2.draw();
        f2.erase();
    }
}