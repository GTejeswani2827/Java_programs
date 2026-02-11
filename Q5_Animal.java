package com.java.javacodingprograms.Inheritannce;
class Animal7 {
    String name;
    int age;
}

class Dog3 extends Animal {
    String breed;
    String color;
}

class Cat6 extends Animal {
    String breed;
    String color;
}

public class Q5_Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno";
        d.age = 3;
        d.breed = "Labrador";
        d.color = "Brown";

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.breed);
        System.out.println(d.color);

        System.out.println();

        Cat c = new Cat();
        c.name = "Kitty";
        c.age = 2;
        c.breed = "Persian";
        c.color = "White";

        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.breed);
        System.out.println(c.color);
    }
}