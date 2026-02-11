package com.java.javacodingprograms.Strings;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.println("Duplicate: " + c);
            }
        }
    }
}