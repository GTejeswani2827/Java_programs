package com.java.javacodingprograms.Encapsulations;
class Student {
    private String name;
    private int rollNo;
    private int age;

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

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
	public void setMarks(int i) {
		// TODO Auto-generated method stub
		
	}
	public char[] getMarks() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Q1_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tej");
        s.setRollNo(101);
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getAge());
    }
}