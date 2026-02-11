package com.java.javacodingprograms.Encapsulations;
class Product {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }

    public void setModel(String model) { this.model = model; }
    public String getModel() { return model; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }
}

public class Q16_Product {
    public static void main(String[] args) {
        Product p = new Product();
        p.setBrand("Dell");
        p.setModel("Inspiron");
        p.setPrice(55000);

        System.out.println(p.getBrand());
        System.out.println(p.getModel());
        System.out.println(p.getPrice());
    }
}