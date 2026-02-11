package com.java.javacodingprograms.Strings;
public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello";
        for (char c : str.toCharArray()) {
            System.out.println(c + ": " + countChar(str, c));
        }
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }
}