package com.java.javacodingprograms.Inheritannce;
class Employee {
    String name;
    int id;
    double salary;
	public int age;
}

public class Employer {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Tej";
        e.id = 101;
        e.salary = 30000;

        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println(e.salary);
    }
}