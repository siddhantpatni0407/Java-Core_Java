/*
 * Problem statement - Java program to count pairs with difference k
 */
package com.sid.tricky_programs;

public class CountPairsWithKDifference {
    public static int countPairsWithDiffK(int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 4, 2};
        int n = arr.length;
        int k = 3;
        System.out.println("Count of pairs with given diff is : " + countPairsWithDiffK(arr, n, k));
    }
}