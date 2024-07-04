package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");

        optional.ifPresent(System.out::println);

        String orElse = optional.orElse("Default Value");
        System.out.println(orElse);
    }
}