package com.java.javacodingprograms.Inheritannce;
class Vehicle {
    String make;
    String model;
    int year;

    void displayVehicle() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String color;
    int mileage;
	public String name;

    void displayCar() {
        displayVehicle();
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Innova";
        car.year = 2022;
        car.color = "White";
        car.mileage = 15;

        car.displayCar();
    }
}
