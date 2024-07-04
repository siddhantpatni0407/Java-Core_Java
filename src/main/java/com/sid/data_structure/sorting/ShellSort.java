package com.sid.data_structure.sorting;

/**
 * Problem Definition: Implement Shell Sort to sort an array of integers in ascending order.
 * <p>
 * Shell Sort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead.
 * When an element has to be moved far ahead, many movements are involved.
 * The idea of shell sort is to allow the exchange of far items. This results in a decrease in the total number of movements.
 * <p>
 * Time Complexity: O(n^2) (depends on gap sequence)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class ShellSort {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        shellSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

}