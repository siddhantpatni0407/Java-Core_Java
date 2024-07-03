package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> sortedStrings = strings.stream()
                .sorted()
                .toList();

        sortedStrings.forEach(System.out::println);
    }
}