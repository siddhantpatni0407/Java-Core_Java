package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalOrElseThrow {
    public static void main(String[] args) {
        String nullName = null;

        try {
            String name = Optional.ofNullable(nullName).orElseThrow(() -> new IllegalArgumentException("Name is null"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}