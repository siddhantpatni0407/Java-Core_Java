package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        String result = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Concatenated String: " + result);
    }

}