package com.java.javacodingprograms.Encapsulations;
class EncapsulationTest {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class Q24_Encapsulation {
    public static void main(String[] args) {
        EncapsulationTest e = new EncapsulationTest();
        e.setMessage("Hello Java");

        System.out.println(e.getMessage());
    }
}