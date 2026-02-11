package com.java.javacodingprograms.Encapsulations;
class Item {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Q20_Price {
    public static void main(String[] args) {
        Item i = new Item();
        i.setPrice(120);

        System.out.println(i.getPrice());
    }
}