package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class StreamJoining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joinedNames);
    }
}