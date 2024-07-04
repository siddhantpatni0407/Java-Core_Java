package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Binary Search to find an element in a sorted array.
 * <p>
 * Binary Search is a search algorithm that finds the position of a target value within a sorted array.
 * Binary search compares the target value to the middle element of the array. If they are not equal,
 * the half in which the target cannot lie is eliminated and the search continues on the remaining half.
 * <p>
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}