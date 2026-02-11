package com.javacode.javacodingprograms.project;
public class QuadraticEquation {
	    public static void main(String[] args) {
	        int a = 1;
	        int b = -3;
	        int c = 2;
	        double d = b * b - 4 * a * c;
	        if (d > 0) {
	            double root1 = (-b + Math.sqrt(d)) / (2 * a);
	            double root2 = (-b - Math.sqrt(d)) / (2 * a);
	            System.out.println("Roots: " + root1 + ", " + root2);
	        } else if (d == 0) {
	            double root = -b / (2 * a);
	            System.out.println("Root: " + root);
	        } else {
	            System.out.println("No real roots");
	        }
	    }
	}
	