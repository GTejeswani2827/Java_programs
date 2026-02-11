package com.java.javacodingprograms.Strings;
public class PangramString {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] mark = new boolean[26];
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') mark[c - 'a'] = true;
        }
        boolean isPangram = true;
        for (boolean b : mark) {
            if (!b) {
                isPangram = false;
                break;
            }
        }
        System.out.println("Is Pangram: " + isPangram);
    }
}
