package com.java.javacodingprograms.Inheritannce;
class Emp1 {
    String name;
    int id;
    double salary;
}

class Manager extends Emp1 {
    String department;
    String designation;
}

public class Q8_Manager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Tej";
        m.id = 102;
        m.salary = 50000;
        m.department = "IT";
        m.designation = "Manager";

        System.out.println(m.name);
        System.out.println(m.id);
        System.out.println(m.salary);
        System.out.println(m.department);
        System.out.println(m.designation);
    }
}