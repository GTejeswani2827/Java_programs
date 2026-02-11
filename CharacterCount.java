package com.java.javacodingprograms.Strings;
public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World";
        char c = 'l';
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) count++;
        }
        System.out.println("Count: " + count);
    }
}