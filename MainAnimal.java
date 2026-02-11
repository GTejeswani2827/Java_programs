package com.java.javacodingprograms.Inheritannce;
class Animal {
    String name;
    int age;

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    public static String type = null;
	public static String type1;
	String breed;
    String color;

    void displayDog() {
        displayAnimal();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

class Cat extends Animal {
    String breed;
    String color;
	public String type;

    void displayCat() {
        displayAnimal();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno";
        d.age = 3;
        d.breed = "Labrador";
        d.color = "Brown";
        d.displayDog();

        System.out.println();

        Cat c = new Cat();
        c.name = "Kitty";
        c.age = 2;
        c.breed = "Persian";
        c.color = "White";
        c.displayCat();
    }
}