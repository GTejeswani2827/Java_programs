package com.java.javacodingprograms.Strings;
public class StringRotation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "llohe";
        System.out.println("Is Rotation: " + (str1.length() == str2.length() && (str1 + str1).contains(str2)));
    }
}