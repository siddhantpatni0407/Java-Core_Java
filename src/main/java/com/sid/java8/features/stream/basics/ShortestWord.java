package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class ShortestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        Optional<String> shortestWord = words.stream()
                .min(Comparator.comparingInt(String::length));

        shortestWord.ifPresent(word -> System.out.println("Shortest word: " + word));
    }
}