package com.java.javacodingprograms.Encapsulations;
class Car {
    private String model;
    private String color;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

public class Q5_Car {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Swift");
        c.setColor("Red");
        c.setPrice(600000);

        System.out.println(c.getModel());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());
    }
}