package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class CountElements {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");

        long count = strings.stream()
                .count();

        System.out.println("Count: " + count);
    }

}