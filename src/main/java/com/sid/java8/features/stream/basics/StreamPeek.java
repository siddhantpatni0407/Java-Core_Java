package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class StreamPeek {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        List<String> modifiedNames = names.stream()
                .peek(name -> System.out.println("Original: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Uppercase: " + name))
                .toList();

        modifiedNames.forEach(System.out::println);
    }
}