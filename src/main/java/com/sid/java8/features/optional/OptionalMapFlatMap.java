package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalMapFlatMap {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");

        Optional<Integer> lengthOptional = optional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length: " + length));

        Optional<Optional<Integer>> nestedOptional = optional.map(value -> Optional.of(value.length()));
        nestedOptional.ifPresent(innerOptional -> innerOptional.ifPresent(length -> System.out.println("Nested Length: " + length)));

        Optional<Integer> flatMappedOptional = optional.flatMap(value -> Optional.of(value.length()));
        flatMappedOptional.ifPresent(length -> System.out.println("FlatMapped Length: " + length));
    }
}