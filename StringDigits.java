package com.java.javacodingprograms.Strings;
public class StringDigits {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Contains only digits: " + str.matches("[0-9]+"));
    }
}