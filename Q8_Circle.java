package com.java.javacodingprograms.Encapsulations;
class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
	public char[] getCircumference() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Q8_Circle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println(c.getArea());
    }
}