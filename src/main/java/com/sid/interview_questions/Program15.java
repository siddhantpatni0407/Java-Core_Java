/**
 * Find occurrence of each character and word in String.
 */
package com.sid.interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program15 {

    public static void findCharacterCount(String input) {
        Map<Character, Integer> charCountMap = new TreeMap<>(); // Changed to TreeMap for sorted output

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                c = Character.toLowerCase(c);
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("\nCharacter Occurrences (Basic Approach):");
        charCountMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static void findCharacterCountUsingStream(String input) {
        Map<Character, Long> charFrequency = input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

        System.out.println("\nCharacter Occurrence (Java 8 Stream):");
        charFrequency.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static void findWordCount(String input) {
        Map<String, Integer> wordCountMap = new TreeMap<>(); // Changed to TreeMap for sorted output

        String[] words = input.toLowerCase().split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("\nWord Occurrences (Basic Approach):");
        wordCountMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static void findWordCountUsingStream(String input) {
        Map<String, Long> wordFrequency = Arrays.stream(input.toLowerCase().split("\\W+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

        System.out.println("\nWord Occurrence (Java 8 Stream):");
        wordFrequency.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static void main(String[] args) {
        String input = "Java is a powerful programming language. Java is platform-independent.";

        System.out.println("Input: " + input);

        findCharacterCount(input);
        findCharacterCountUsingStream(input);

        findWordCount(input);
        findWordCountUsingStream(input);
    }

}