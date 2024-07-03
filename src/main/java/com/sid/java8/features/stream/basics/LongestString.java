package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));

        longestString.ifPresent(System.out::println);
    }
}