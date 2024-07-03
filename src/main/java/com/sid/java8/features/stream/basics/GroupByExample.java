package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class GroupByExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apricot", "blueberry");

        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        groupedByFirstLetter.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}