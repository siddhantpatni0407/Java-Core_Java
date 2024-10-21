package com.sid.tricky_programs;

/**
 * Input:
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * <p>
 * Output:
 * 4 8 12 16
 * 3 7 11 15
 * 2 6 10 14
 * 1 5 9 13
 */

public class MatrixRotation {

    // Function to print the matrix in the desired output format
    public static void printRotatedMatrix(int[][] matrix) {
        int n = matrix.length;

        // Loop to print each row from last to first, picking columns from last to first
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        // Define the input matrix directly
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Print the matrix in the desired output format
        printRotatedMatrix(matrix);
    }


}
