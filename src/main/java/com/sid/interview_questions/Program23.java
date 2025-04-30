/**
 * Write a Java program to find common elements between two integer arrays.
 */
package com.sid.interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program23 {

    /**
     * Approach 1: Java 8 boxed + retainAll
     */
    public static Set<Integer> findCommonWithRetainAll(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        set1.retainAll(set2); // set1 now contains only common elements
        return set1;
    }

    /**
     * Approach 2: Java 8 boxed + contains check
     */
    public static Set<Integer> findCommonWithContains(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());

        return Arrays.stream(arr2)
                .boxed()
                .filter(set1::contains)
                .collect(Collectors.toSet());
    }

    /**
     * Approach 3: Traditional for-loop with Set
     */
    public static Set<Integer> findCommonWithForLoop(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 2};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Approach 1 - retainAll: " + findCommonWithRetainAll(array1, array2));
        System.out.println("Approach 2 - contains + boxed: " + findCommonWithContains(array1, array2));
        System.out.println("Approach 3 - for loop: " + findCommonWithForLoop(array1, array2));
    }

}