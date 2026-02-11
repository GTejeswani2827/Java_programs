package com.javacode.javacodingprograms.project;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Scanner.nextInt();
        
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
