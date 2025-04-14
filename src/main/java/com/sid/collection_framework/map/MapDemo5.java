package com.sid.collection_framework.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo5 {

    public static void main(String[] args) {

        // Group by with Streams

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Daniel");

        Map<Character, List<String>> groupedByFirstLetter =
                names
                .stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByFirstLetter);
    }

}