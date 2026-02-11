package com.java.javacodingprograms.Encapsulations;
class Laptop {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(double price) { this.price = price; }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
}

public class Q18_Laptop {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setBrand("HP");
        l.setModel("Pavilion");
        l.setPrice(65000);

        System.out.println(l.getBrand());
        System.out.println(l.getModel());
        System.out.println(l.getPrice());
    }
}