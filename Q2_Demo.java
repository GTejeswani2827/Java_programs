package com.java.javacodingprograms.Encapsulations;
class Student2 {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class Q2_Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(21);
        System.out.println(s.getAge());
    }
}