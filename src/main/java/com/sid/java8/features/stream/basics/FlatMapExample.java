package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened List: " + flattenedList);
    }

}