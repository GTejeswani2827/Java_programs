package com.java.javacodingprograms.Encapsulations;
class Student6 {
    private String name;
    private int rollNo;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }
}

public class Q27_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anu");
        s.setRollNo(12);
        s.setMarks(85);

        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getMarks());
    }
}