package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalOfNullable {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println("Optional value: " + optional);
    }
}