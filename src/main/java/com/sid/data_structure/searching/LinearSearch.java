package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Linear Search to find an element in an array.
 * <p>
 * Linear Search is a simple search algorithm that checks every element in the array until the desired element is found or the end of the array is reached.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class LinearSearch {

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}