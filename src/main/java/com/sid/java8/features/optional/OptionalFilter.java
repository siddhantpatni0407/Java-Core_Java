package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalFilter {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");

        optional.filter(value -> value.startsWith("Hello"))
                .ifPresent(value -> System.out.println("Filtered Value: " + value));

        optional.filter(value -> value.startsWith("Hi"))
                .ifPresent(value -> System.out.println("This will not be printed"));
    }
}