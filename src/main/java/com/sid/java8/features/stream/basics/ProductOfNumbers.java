package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ProductOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
    }
}