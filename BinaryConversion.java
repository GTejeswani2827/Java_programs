package com.java.javacodingprograms.Datatypes;
public class BinaryConversion {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);
        
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);
    }
}