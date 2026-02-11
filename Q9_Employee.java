package com.java.javacodingprograms.Encapsulations;
class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}

public class Q9_Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ravi");
        e.setId(201);
        e.setSalary(40000);

        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
    }
}