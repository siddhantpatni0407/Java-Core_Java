package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalNullHandling {
    public static void main(String[] args) {
        String nullName = null;

        Optional<String> nameOptional = Optional.ofNullable(nullName);
        String name = nameOptional.orElse("Default Name");

        System.out.println("Name: " + name);
    }
}