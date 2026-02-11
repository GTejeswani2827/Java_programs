package com.java.javacodingprograms.Datatypes;
public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("IndexOf: " + str.indexOf("World"));
        System.out.println("Equals: " + str.equals("Hello World"));
    }
}