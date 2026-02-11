package com.java.javacodingprograms.Abstraction;
public class MainVehicle2 {
    public static void main(String[] args) {
        Vehicle2 v1 = new Car2();
        Vehicle2 v2 = new Truck();

        v1.drive();
        v1.stop();

        v2.drive();
        v2.stop();
    }
}