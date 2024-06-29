package com.sid.collection_framework.array;

import java.util.Arrays;

/**
 * Note:-
 * java.util.Arrays uses quicksort for primitive types such as int and
 * mergesort for objects that implement Comparable or use a Comparator.
 */

/**
 * @author Siddhant Patni
 */
public class ArraySort {

    public static void main(String[] args) {
        String[] countries = {"India", "United States", "Malaysia", "Australia", "London"};
        Arrays.sort(countries);
        for (String country : countries) {
            System.out.println(country);
        }
    }

}