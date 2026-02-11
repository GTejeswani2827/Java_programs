package com.java.javacodingprograms.Inheritannce;
class Person7 {
    String name;
    int age;
}

class Student3 extends Person {
    int rollNo;
    String subject;
}

class Teacher extends Person {
    String subject;
}

public class Q9_Person {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anu";
        s.age = 20;
        s.rollNo = 12;
        s.subject = "Java";

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.rollNo);
        System.out.println(s.subject);
    }
}