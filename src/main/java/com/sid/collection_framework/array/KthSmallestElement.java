package com.sid.collection_framework.array;

import java.util.Arrays;

/**
 * @author Siddhant Patni
 */

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);
        int kthSmallest = arr[k - 1];

        System.out.println(k + "th smallest element: " + kthSmallest);
    }
}