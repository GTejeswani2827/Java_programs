package com.java.javacodingprograms.Datatypes;
public class StringIntegerConversion {
    public static void main(String[] args) {
        String str = "10";
        int num = Integer.parseInt(str);
        System.out.println("Integer: " + num);
        
        String str2 = Integer.toString(num);
        System.out.println("String: " + str2);
    }
}