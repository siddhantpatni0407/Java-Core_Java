package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class FindFirstMatching {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        Optional<String> result = strings.stream()
                .filter(s -> s.startsWith("b"))
                .findFirst();

        result.ifPresent(System.out::println);
    }
}