package com.java.javacodingprograms.Abstraction;
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats food");
    }

    void sleep() {
        System.out.println("Dog sleeps");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat eats food");
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}