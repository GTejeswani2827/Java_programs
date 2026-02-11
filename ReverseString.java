package com.java.javacodingprograms.Strings;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed String: " + sb.reverse());
    }
}
