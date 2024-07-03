package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class FilterAndMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> lengthsOfStringsStartingWithB = strings.stream()
                .filter(s -> s.startsWith("b"))
                .map(String::length)
                .toList();

        lengthsOfStringsStartingWithB.forEach(System.out::println);
    }
}