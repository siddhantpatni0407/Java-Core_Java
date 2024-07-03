package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class CountMatching {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        long count = strings.stream()
                .filter(s -> s.startsWith("a"))
                .count();

        System.out.println("Count of strings starting with 'a': " + count);
    }
}