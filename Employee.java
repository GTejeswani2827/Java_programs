package com.java.javacodingprograms.Abstraction;
abstract class Employee {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager salary calculated");
    }

    void calculateBonus() {
        System.out.println("Manager bonus calculated");
    }
}

class Clerk extends Employee {
    void calculateSalary() {
        System.out.println("Clerk salary calculated");
    }

    void calculateBonus() {
        System.out.println("Clerk bonus calculated");
    }
}