package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8);

        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("There is an even number: " + hasEven);
    }
}