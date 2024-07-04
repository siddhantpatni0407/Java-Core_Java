package com.sid.java8.features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        Predicate<String> startsWithP = s -> s.startsWith("P");

        List<String> result = names.stream()
                .filter(startsWithP)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}