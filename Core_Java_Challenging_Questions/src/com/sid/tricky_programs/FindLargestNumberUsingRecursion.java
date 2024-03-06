/**
 * Problem statement - Write a method to return the maximum value from an integer array
 * passed as an input parameter using recursion
 */

package com.sid.tricky_programs;

public class FindLargestNumberUsingRecursion {
    public static int returnLargetNumber(int arr[], int len) {
        if (len == 1) {
            return arr[0];
        }
        return Math.max(arr[len - 1], returnLargetNumber(arr, len - 1));
    }

    public static void main(String[] args) {
        int arr[] = {55, 12, 0, 786, 98};
        int len = arr.length;
        System.out.println("Largest number in given array : " + returnLargetNumber(arr, len));
    }
}