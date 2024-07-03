package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class FindMaxMinValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);

        max.ifPresent(value -> System.out.println("Max value: " + value));

        min.ifPresent(value -> System.out.println("Min value: " + value));
    }

}