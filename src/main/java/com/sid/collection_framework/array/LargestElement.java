package com.sid.collection_framework.array;

import java.util.Arrays;

/**
 * @author Siddhant Patni
 */
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}