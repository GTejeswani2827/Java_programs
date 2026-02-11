package com.java.javacodingprograms.Inheritannce;
class Shaps {
    String type;
    String color;
}

class Triangle extends Shape {
    double base;
    double height;
	public String type;
	public String color;
	public String name;
}

public class Q13_Triangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.type = "Triangle";
        t.color = "Red";
        t.base = 5;
        t.height = 8;

        System.out.println(t.type);
        System.out.println(t.color);
        System.out.println(t.base);
        System.out.println(t.height);
    }
}