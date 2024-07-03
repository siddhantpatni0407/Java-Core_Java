package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 7);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}