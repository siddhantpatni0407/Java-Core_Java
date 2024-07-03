package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class CollectToSet {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "apple");

        Set<String> set = strings.stream()
                .collect(Collectors.toSet());

        set.forEach(System.out::println);
    }
}