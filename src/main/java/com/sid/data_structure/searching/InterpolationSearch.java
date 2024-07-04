package com.sid.data_structure.searching;

/**
 * Problem Definition: Implement Interpolation Search to find an element in a sorted array.
 * <p>
 * Interpolation Search is an algorithm for searching for a key in an array that has been ordered by numerical values assigned to the keys (key values).
 * <p>
 * Time Complexity: O(log log n) (if the data is uniformly distributed)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) {
                    return low;
                }
                return -1;
            }

            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            if (arr[pos] == x) {
                return pos;
            }

            if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18;
        int result = interpolationSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}