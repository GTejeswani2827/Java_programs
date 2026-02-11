package com.javacode.javacodingprograms.project;
public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World";
        char c = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count of '" + c + "': " + count);
    }
}