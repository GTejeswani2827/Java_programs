package com.java.javacodingprograms.Strings;
public class CommanCharacters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) != -1) {
                System.out.println("Common: " + c);
            }
        }
    }
}