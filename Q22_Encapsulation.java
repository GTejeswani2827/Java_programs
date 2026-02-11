package com.java.javacodingprograms.Encapsulations;
class DemoEncapsulation {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Q22_Encapsulation {
    public static void main(String[] args) {
        DemoEncapsulation d = new DemoEncapsulation();
        d.setValue(100);

        System.out.println(d.getValue());
    }
}