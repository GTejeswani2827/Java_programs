package com.javacode.javacodingprograms.project;
public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
    
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    
    public static int reverse(int num) {
        if (num < 10) {
            return num;
        } else {
            return (num % 10) * (int) Math.pow(10, (int) Math.log10(num)) + reverse(num / 10);
        }
    }
}
