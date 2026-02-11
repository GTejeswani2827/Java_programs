package com.java.javacodingprograms.Inheritannce;
class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNo;
	public String subject;
}

public class Q10_Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";
        s.age = 21;
        s.rollNo = 15;

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.rollNo);
    }
}