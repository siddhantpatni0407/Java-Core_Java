/**
 * Write a Java program to find all consecutive repeating characters in a string.
 */
package com.sid.interview_questions;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program26 {

    // Approach 1: Using Java 8 Streams
    public static Set<Character> findConsecutiveDuplicatesStream(String input) {
        return IntStream.range(0, input.length() - 1)
                .filter(i -> input.charAt(i) == input.charAt(i + 1))
                .mapToObj(input::charAt)
                .collect(Collectors.toSet());
    }

    // Approach 2: Using traditional loop
    public static Set<Character> findConsecutiveDuplicatesLoop(String input) {
        Set<Character> result = new LinkedHashSet<>();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                result.add(input.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "ABCDDEFEFGGH";

        // Call approach using Streams
        Set<Character> resultWithStreams = findConsecutiveDuplicatesStream(input);
        System.out.println("Approach 1 (Stream): " + resultWithStreams);

        // Call approach using loop
        Set<Character> resultWithLoop = findConsecutiveDuplicatesLoop(input);
        System.out.println("Approach 2 (Loop): " + resultWithLoop);
    }

}