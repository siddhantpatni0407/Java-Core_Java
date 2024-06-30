package com.sid.collection_framework.array;

import java.util.Arrays;

/**
 * @author Siddhant Patni
 */

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;  // Change this value to find a different kth largest element

        // Sort the array in ascending order
        Arrays.sort(arr);

        // The kth largest element will be at index length - k
        int kthLargest = arr[arr.length - k];

        System.out.println(k + "th largest element: " + kthLargest);
    }
}