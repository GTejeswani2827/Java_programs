package com.java.javacodingprograms.statics;
public class CelsiusToFahrenheit {
    public static double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("30°C in Fahrenheit: " + CelsiusToFahrenheit.convert(30));
    }
}