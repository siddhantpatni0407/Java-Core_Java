package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author Siddhant Patni
 */
public class FindAverage {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        average.ifPresent(value -> System.out.println("Average: " + value));
    }

}