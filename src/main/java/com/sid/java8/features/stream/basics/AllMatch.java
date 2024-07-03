package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class AllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println("All numbers are even: " + allEven);
    }
}