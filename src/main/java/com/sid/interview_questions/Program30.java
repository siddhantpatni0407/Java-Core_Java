/**
 * Given a list of String, fruits (with possible duplicates and different cases like "apple", "APPLE"),
 * print the positions (indices) where each fruit occurs in the list, ignoring case sensitivity.
 * <p>
 * Input:   ["Apple", "Orange", "Banana", "apple", "pear", "banana", "orange"]
 * Output:  apple present at [0, 2, 5]
 *          orange present at [1, 4]
 *          banana present at [3]
 */

package com.sid.interview_questions;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program30 {

    // Approach 1: Using traditional for-loop with computeIfAbsent
    public static void getFruitPositionsUsingLoop(List<String> fruits) {
        Map<String, List<Integer>> fruitPositions = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i).toLowerCase();
            fruitPositions.computeIfAbsent(fruit, k -> new ArrayList<>()).add(i);
        }

        fruitPositions.forEach((fruit, positions) ->
                System.out.println(fruit + " present at " + positions));
    }

    // Approach 2: Using Java 8 Streams
    public static void getFruitPositionsUsingStreams(List<String> fruits) {
        Map<String, List<Integer>> fruitPositions = IntStream.range(0, fruits.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> fruits.get(i).toLowerCase(), LinkedHashMap::new, Collectors.toList()));

        fruitPositions.forEach((fruit, positions) ->
                System.out.println(fruit + " present at " + positions));
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "Orange", "apple", "Banana", "orange", "APPLE");

        System.out.println("Approach 1: Using for-loop and computeIfAbsent");
        getFruitPositionsUsingLoop(fruits);

        System.out.println("\nApproach 2: Using Java 8 Streams");
        getFruitPositionsUsingStreams(fruits);
    }

}