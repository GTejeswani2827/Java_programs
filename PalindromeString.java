package com.javacode.javacodingprograms.project;
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Is palindrome: " + str.equals(reversed));
    }
}