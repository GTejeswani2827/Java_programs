package com.java.javacodingprograms.Encapsulations;
class Book1 {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class Q19_Book {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java");
        b.setAuthor("James");
        b.setPrice(450);

        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
    }
}