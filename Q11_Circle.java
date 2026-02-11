package com.java.javacodingprograms.Encapsulations;
class Circle5 {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Q11_Circle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}