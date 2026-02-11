package com.java.javacodingprograms.Encapsulations;
class Student5 {
    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
}

public class Q7_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anu");
        s.setRollNo(12);

        System.out.println(s.getName());
        System.out.println(s.getRollNo());
    }
}