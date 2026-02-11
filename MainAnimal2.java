package com.java.javacodingprograms.Abstraction;
public class MainAnimal2 {
    public static void main(String[] args) {
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();

        a1.eat();
        a1.sleep();

        a2.eat();
        a2.sleep();
    }
}