package com.java.javacodingprograms.Encapsulations;
class Rectangle2 {
    private double length;
    private double width;
    private double area;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        area = length * width;
        return area;
    }
}

public class Q23_Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(4);

        System.out.println(r.getArea());
    }
}