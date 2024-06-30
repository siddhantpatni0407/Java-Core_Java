package com.sid.collection_framework.array;

import java.util.HashSet;

/**
 * @author Siddhant Patni
 */
public class UnionArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.print("Union: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}