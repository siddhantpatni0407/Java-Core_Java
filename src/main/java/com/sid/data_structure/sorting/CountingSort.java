package com.sid.data_structure.sorting;

/**
 * Problem Definition: Implement Counting Sort to sort an array of integers in ascending order.
 * <p>
 * Counting Sort is a non-comparison based sorting algorithm. It is an integer sorting algorithm that operates by counting the number of objects
 * that have each distinct key value, and using arithmetic to determine the positions of each key value in the output sequence.
 * <p>
 * Time Complexity: O(n + k)
 * Space Complexity: O(n + k)
 * <p>
 * where n is the number of elements in the input array and k is the range of the input.
 *
 * @author Siddhant Patni
 */

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
        countingSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

}