package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class GroupByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((length, group) -> {
            System.out.println(length + ": " + group);
        });
    }
}