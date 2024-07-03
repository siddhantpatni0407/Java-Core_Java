package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class IntToString {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        List<String> strings = integers.stream()
                .map(String::valueOf)
                .toList();

        strings.forEach(System.out::println);
    }
}