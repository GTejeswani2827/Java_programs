package com.java.javacodingprograms.Encapsulations;
class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    public double getArea() {
        return length * width;
    }
}

public class Q12_Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(4);

        System.out.println(r.getArea());
    }
}