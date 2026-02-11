package com.java.javacodingprograms.Abstraction;
abstract class Animal2 {
    abstract void eat();
    abstract void sleep();
}

class Dog2 extends Animal2 {
    void eat() {
        System.out.println("Dog eats");
    }
    void sleep() {
        System.out.println("Dog sleeps");
    }
}

class Cat2 extends Animal2 {
    void eat() {
        System.out.println("Cat eats");
    }
    void sleep() {
        System.out.println("Cat sleeps");
    }
}