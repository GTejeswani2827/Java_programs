package com.java.javacodingprograms.Encapsulations;
class Mobile {
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

public class Q14_Mobile {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBrand("Samsung");
        m.setModel("A54");
        m.setPrice(25000);

        System.out.println(m.getBrand());
        System.out.println(m.getModel());
        System.out.println(m.getPrice());
    }
}