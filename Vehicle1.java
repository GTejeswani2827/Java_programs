package com.java.javacodingprograms.Abstraction;
abstract class Vehicle1 {
    abstract void start();
    abstract void stop();
}

class Car1 extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
    void stop() {
        System.out.println("Car Stopped");
    }
}

class Motorcycle1 extends Vehicle {
    void start() {
        System.out.println("Motorcycle Started");
    }
    void stop() {
        System.out.println("Motorcycle Stopped");
    }
}