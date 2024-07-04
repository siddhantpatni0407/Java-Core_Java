package com.sid.data_structure.sorting;

/**
 * Problem Definition: Implement Quick Sort to sort an array of integers in ascending order.
 * <p>
 * Quick Sort is an efficient, in-place (can be implemented in-place) sorting algorithm. It is a comparison sort and
 * uses divide and conquer strategy. It works by selecting a 'pivot' element from the array and partitioning the other elements into two
 * sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
 * <p>
 * Time Complexity: O(n log n) on average
 * Space Complexity: O(log n)
 *
 * @author Siddhant Patni
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

}