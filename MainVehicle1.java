package com.java.javacodingprograms.Abstraction;
public class MainVehicle1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}