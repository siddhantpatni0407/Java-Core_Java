package com.sid.collection_framework.array;

/**
 * @author Siddhant Patni
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}