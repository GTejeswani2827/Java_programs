package com.javacode.javacodingprograms.project;
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
