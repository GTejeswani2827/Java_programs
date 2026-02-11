package com.java.javacodingprograms.Strings;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println("Capitalized: " + sb.toString().trim());
    }
}