package com.javacode.javacodingprograms.project;
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Divisible by both 5 and 7");
        } else {
            System.out.println("Not divisible by both 5 and 7");
        }
    }
}
