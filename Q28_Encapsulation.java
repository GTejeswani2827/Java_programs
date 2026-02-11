package com.java.javacodingprograms.Encapsulations;
class Sample4 {
    private double data;

    public void setData(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }
}

public class Q28_Encapsulation {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setData(99.9);

        System.out.println(s.getData());
    }
}