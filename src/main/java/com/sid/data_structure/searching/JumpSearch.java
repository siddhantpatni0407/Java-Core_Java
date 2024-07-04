package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Jump Search to find an element in a sorted array.
 * <p>
 * Jump Search is a search algorithm for ordered lists. The basic idea is to check fewer elements by jumping ahead by fixed steps or skipping some elements in place of searching all elements.
 * <p>
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class JumpSearch {

    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr[prev] == x) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        int result = jumpSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}