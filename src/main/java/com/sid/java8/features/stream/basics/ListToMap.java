package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class ListToMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> map = strings.stream()
                .collect(Collectors.toMap(s -> s, String::length));

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}