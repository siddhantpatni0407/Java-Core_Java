/**
 * Write a Java program to find and return all repeated characters in a given string
 * Input : programming
 * Output : {g=2, r=2, m=2} or [g, r, m]
 */
package com.sid.interview_questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program20 {

    // Approach 1: Java 8 Streams
    public static Map<Character, Long> findRepeatedCharactersUsingStream(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // Approach 2: Using traditional Map
    public static Set<Character> findRepeatedCharactersUsingMap(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        Set<Character> repeated = new HashSet<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.get(c) == 2) {
                repeated.add(c);
            }
        }

        return repeated;
    }

    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Approach 1 (Java 8 Stream):");
        Map<Character, Long> repeated1 = findRepeatedCharactersUsingStream(input);
        System.out.println(repeated1);

        System.out.println("Approach 2 (Using Map manually):");
        Set<Character> repeated2 = findRepeatedCharactersUsingMap(input);
        System.out.println(repeated2);
    }

}