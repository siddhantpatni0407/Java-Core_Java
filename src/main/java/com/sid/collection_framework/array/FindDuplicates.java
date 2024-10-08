package com.sid.collection_framework.array;

import java.util.HashSet;

/**
 * @author Siddhant Patni
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.print("Duplicates: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}