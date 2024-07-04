package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalIsPresent {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");

        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        }

        optional.ifPresent(value -> System.out.println("Value using ifPresent: " + value));
    }
}