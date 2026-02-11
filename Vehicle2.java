package com.java.javacodingprograms.Abstraction;
abstract class Vehicle2 {
    abstract void drive();
    abstract void stop();
}

class Car2 extends Vehicle2 {
    void drive() {
        System.out.println("Car driving");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

class Truck extends Vehicle2 {
    void drive() {
        System.out.println("Truck driving");
    }

    void stop() {
        System.out.println("Truck stopped");
    }
}