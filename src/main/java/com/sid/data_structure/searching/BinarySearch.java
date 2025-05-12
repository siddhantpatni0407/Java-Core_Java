package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Binary Search to find an element in a sorted array.
 * <p>
 * Binary Search is a search algorithm that finds the position of a target value within a sorted array.
 * Binary search compares the target value to the middle element of the array. If they are not equal,
 * the half in which the target cannot lie is eliminated, and the search continues on the remaining half.
 * <p>
 * Time Complexity: O(log n)
 * Space Complexity (Iterative): O(1)
 * Space Complexity (Recursive): O(log n) due to call stack
 *
 * @author Siddhant Patni
 */
public class BinarySearch {

    // Iterative approach for Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // Calculate mid to avoid overflow
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    // Recursive approach for Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Base case: if the element is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Recursive case: search in the left half
            if (arr[mid] > target) {
                return binarySearchRecursive(arr, left, mid - 1, target);
            }

            // Recursive case: search in the right half
            return binarySearchRecursive(arr, mid + 1, right, target);
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int[] testCases = {4};

        System.out.println("Iterative Binary Search Results:");
        for (int x : testCases) {
            int result = binarySearchIterative(arr, x);
            printResult(x, result);
        }

        System.out.println("\nRecursive Binary Search Results:");
        for (int x : testCases) {
            int result = binarySearchRecursive(arr, 0, arr.length - 1, x);
            printResult(x, result);
        }
    }

    // Utility method to print search result
    private static void printResult(int x, int result) {
        if (result == -1) {
            System.out.println("Element " + x + " not present");
        } else {
            System.out.println("Element " + x + " found at index " + result);
        }
    }

}