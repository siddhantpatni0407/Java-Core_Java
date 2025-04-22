/**
 * Write a Java 8 program to Counts only alphabet characters ignoring digits and special characters.
 * Input  : ABA{E}/KK245
 * Output :
 * A - 2
 * B - 1
 * E - 1
 * K - 2
 */
package com.sid.interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program18 {

    public static void main(String[] args) {

        String input = "ABA{E}/KK245";

        Map<Character, Long> alphabetCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        alphabetCount.forEach((k, v) -> System.out.println(k + " - " + v));

    }

}