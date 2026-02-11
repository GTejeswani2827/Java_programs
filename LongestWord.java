package com.java.javacodingprograms.Strings;
public class LongestWord {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
