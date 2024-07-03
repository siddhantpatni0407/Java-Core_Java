package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class ConvertToUpperCase {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();

        upperCaseStrings.forEach(System.out::println);
    }

}