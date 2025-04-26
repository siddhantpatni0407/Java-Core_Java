/**
 * Search for a target element in a row-wise and column-wise sorted 2D matrix.
 * <p>
 * Input matrix:
 * 1  4  7 11 15
 * 2  5  8 12 19
 * 3  6  9 16 22
 * 10 13 14 17 24
 * 18 21 23 26 30
 * Target:    21
 */
package com.sid.interview_questions;


/**
 * @author Siddhant Patni
 */
public class Program22 {

    // Approach 1: Start from Top-Right Corner
    public static void searchFromTopRight(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Element found at (" + i + ", " + j + ")");
                return;
            } else if (matrix[i][j] > target) {
                j--; // move left
            } else {
                i++; // move down
            }
        }
        System.out.println("Element not found.");
    }

    // Approach 2: Brute Force Search (Traverse All Elements)
    public static void searchBruteForce(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found.");
    }

    // Approach 3: Binary Search Row-wise
    public static void searchBinaryRowWise(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int low = 0, high = cols - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[i][mid] == target) {
                    System.out.println("Element found at (" + i + ", " + mid + ")");
                    return;
                } else if (matrix[i][mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        System.out.println("Element not found.");
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 21;

        // Call Top-Right Search
        System.out.println("Using Top-Right Optimized Approach:");
        searchFromTopRight(matrix, target);

        // Call Brute Force Search
        System.out.println("\nUsing Brute Force Approach:");
        searchBruteForce(matrix, target);

        // Call Brute Force Search
        System.out.println("\nBinary Search Row-wise Approach:");
        searchBinaryRowWise(matrix, target);
    }

}

/**
 * Time Complexities:
 * <p>
 * Approach	                Time	        When to Use
 * Top-Right Search	        O(M+N)	        Matrix row+column sorted
 * Row-wise Binary Search	O(M logN)	    Rows sorted individually
 * Brute Force Search	    O(M×N)	        Small matrices or easy validation
 */