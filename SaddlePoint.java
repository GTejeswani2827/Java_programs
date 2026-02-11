package com.javacode.javacodingprograms.project;
public class SaddlePoint {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean isSaddle = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col] > min) {
                    isSaddle = false;
                    break;
                }
            }
            if (isSaddle) {
                System.out.println("Saddle Point: " + min);
                return;
            }
        }
        System.out.println("No Saddle Point");
    }
}
