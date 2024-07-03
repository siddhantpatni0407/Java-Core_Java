package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class StringLengths {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();

        lengths.forEach(System.out::println);
    }
}