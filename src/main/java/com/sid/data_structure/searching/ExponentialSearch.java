package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Exponential Search to find an element in a sorted array.
 * <p>
 * Exponential Search is an algorithm, used for searching sorted, unbounded/infinite lists.
 * The algorithm consists of two steps: finding the range where the target element might be, and performing binary search within that range.
 * <p>
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int n, int x) {
        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
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
        int result = exponentialSearch(arr, arr.length, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}