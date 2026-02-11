package com.java.javacodingprograms.Abstraction;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started");
    }

    void stop() {
        System.out.println("Motorcycle stopped");
    }
}