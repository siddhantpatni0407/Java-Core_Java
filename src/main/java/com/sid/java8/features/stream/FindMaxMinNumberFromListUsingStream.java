/**
 * Problem statement - Write a program to return the maximum and minimum value from an integer array
 * using java 8 stream.
 */
package com.sid.java8.features.stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxMinNumberFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 1, 12, 786, 98);

        Integer largestNumber = list.stream().max(Integer::compare).get();
        System.out.println("Largest number in given array  : " + largestNumber);

        Integer smallestNumber = list.stream().min(Integer::compare).get();
        System.out.println("Smallest number in given array : " + smallestNumber);
    }
}