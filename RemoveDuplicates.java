package com.java.javacodingprograms.Strings;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "hello";
        String result = removeDuplicates(str);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}