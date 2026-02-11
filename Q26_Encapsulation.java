package com.java.javacodingprograms.Encapsulations;
class NumberData {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Q26_Encapsulation {
    public static void main(String[] args) {
        NumberData n = new NumberData();
        n.setNumber(25);

        System.out.println(n.getNumber());
    }
}