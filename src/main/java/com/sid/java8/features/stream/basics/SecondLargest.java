package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondLargest.ifPresent(value -> System.out.println("Second largest: " + value));
    }
}