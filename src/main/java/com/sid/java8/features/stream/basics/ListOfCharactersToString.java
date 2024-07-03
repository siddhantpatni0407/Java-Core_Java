package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class ListOfCharactersToString {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');

        String result = chars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("String: " + result);
    }
}