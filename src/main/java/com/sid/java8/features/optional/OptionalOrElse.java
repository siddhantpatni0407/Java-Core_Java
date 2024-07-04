package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalOrElse {
    public static void main(String[] args) {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Default Name");
        System.out.println("Name: " + name);

        String anotherName = Optional.ofNullable(nullName).orElseGet(() -> "Another Default Name");
        System.out.println("Another Name: " + anotherName);
    }
}