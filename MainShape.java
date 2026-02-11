package com.java.javacodingprograms.Inheritannce;
class Shape {
    public String type1;
	public String color1;
	public String color2;
	public String type;
	public String color;

	void area() {
        System.out.println("Calculating area...");
    }

    void perimeter() {
        System.out.println("Calculating perimeter...");
    }
}

class Circle extends Shape {
    double radius = 5;
	public String type;
	public String color;
	public double area;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * radius));
    }

	public void showCircle1() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

class Rectangle extends Shape {
    double length = 6;
    double width = 4;
	public String color;
	public String name;

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }

	public void showRectangle() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

public class MainShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();
    }
}