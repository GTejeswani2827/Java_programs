package com.java.javacodingprograms.Abstraction;
public class MainAnimal1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();
        a1.sleep();

        a2.eat();
        a2.sleep();
    }
}