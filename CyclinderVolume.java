package com.java.javacodingprograms.statics;
public class CyclinderVolume {
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        System.out.println("Volume of cylinder with radius 5 and height 10: " + CyclinderVolume.volume(5, 10));
    }
}
