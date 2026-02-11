package com.java.javacodingprograms.Abstraction;
public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Clerk();

        e1.calculateSalary();
        e1.calculateBonus();

        e2.calculateSalary();
        e2.calculateBonus();
    }
}