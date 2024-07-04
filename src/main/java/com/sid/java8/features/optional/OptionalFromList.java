package com.sid.java8.features.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class OptionalFromList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        Optional<String> foundName = names.stream()
                .filter(name -> name.equals("Anna"))
                .findFirst();

        foundName.ifPresent(name -> System.out.println("Found: " + name));
    }
}