package com.java.javacodingprograms.Datatypes;
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Is Palindrome: " + str.equals(rev));
    }
}