package com.sid.java8.features.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}