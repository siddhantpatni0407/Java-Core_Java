package com.sid.java8.features.stream.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 */
public class InfiniteNaturalNumbers {
    public static void main(String[] args) {
        List<Integer> naturalNumbers = Stream.iterate(1, n -> n + 1)
                .limit(10)
                .toList();

        naturalNumbers.forEach(System.out::println);
    }
}