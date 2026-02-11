package com.java.javacodingprograms.Encapsulations;
class Student4 {
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public int getRollNo() { return rollNo; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
}

public class Q10_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anu");
        s.setRollNo(11);
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getAge());
    }
}