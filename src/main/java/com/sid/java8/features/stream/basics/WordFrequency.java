package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple");

        Map<String, Long> frequency = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        frequency.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}