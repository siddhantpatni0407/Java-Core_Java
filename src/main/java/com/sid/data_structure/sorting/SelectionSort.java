package com.sid.data_structure.sorting;

/**
 * Problem Definition: Implement Selection Sort to sort an array of integers in ascending order.
 * <p>
 * Selection Sort is a simple sorting algorithm that divides the input list into two parts:
 * the sublist of items already sorted, which is built up from left to right at the front (left) of the list,
 * and the sublist of items remaining to be sorted that occupy the rest of the list.
 * Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
 * The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist,
 * swapping it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
 * <p>
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap arr[i] and arr[minIdx]
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

}