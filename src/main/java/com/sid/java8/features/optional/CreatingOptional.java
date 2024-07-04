package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class CreatingOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        System.out.println("Optional value: " + optional.get());
    }
}