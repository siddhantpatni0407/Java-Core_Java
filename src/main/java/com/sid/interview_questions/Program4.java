/**
 * Java program to convert a string representing numbers into an integer.
 * Example 1:
 * Input: "Three hundred million"
 * Output: 300,000,000
 * Example 2:
 * Input: "Five Hundred Thousand"
 * Output: 500,000
 */

package com.sid.interview_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Siddhant Patni
 */
public class Program4 {

    private static final Map<String, Integer> numberMap = new HashMap<>();

    static {
        // Basic numbers
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        numberMap.put("ten", 10);

        // Teens
        numberMap.put("eleven", 11);
        numberMap.put("twelve", 12);
        numberMap.put("thirteen", 13);
        numberMap.put("fourteen", 14);
        numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16);
        numberMap.put("seventeen", 17);
        numberMap.put("eighteen", 18);
        numberMap.put("nineteen", 19);

        // Tens
        numberMap.put("twenty", 20);
        numberMap.put("thirty", 30);
        numberMap.put("forty", 40);
        numberMap.put("fifty", 50);
        numberMap.put("sixty", 60);
        numberMap.put("seventy", 70);
        numberMap.put("eighty", 80);
        numberMap.put("ninety", 90);

        // Powers of ten
        numberMap.put("hundred", 100);
        numberMap.put("thousand", 1000);
        numberMap.put("million", 1_000_000);
        numberMap.put("billion", 1_000_000_000);
    }

    public static int convert(String input) {
        // Pre-process input to make it lower-case and split by spaces
        List<String> words = Arrays
                .stream(input.toLowerCase()
                        .split("\\s+"))
                .map(word -> word
                        .replaceAll("-", ""))
                .toList();

        int result = 0;
        int current = 0;

        for (String word : words) {
            if (numberMap.containsKey(word)) {
                int value = numberMap.get(word);

                if (value == 100) {
                    current *= value; // Multiply by 100
                } else if (value >= 1000) {
                    result += current * value; // Multiply by thousand/million
                    current = 0; // Reset current for the next group
                } else {
                    current += value; // Add to current value
                }
            }
        }

        result += current; // Add the remaining value
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "Three hundred million";
        System.out.println("Input : " + input1);
        System.out.println("Output : " + convert(input1));

        // Example 2
        String input2 = "Five hundred thousand";
        System.out.println("Input : " + input2);
        System.out.println("Output : " + convert(input2));

        // Example 3
        String input3 = "One Thousand Three Hundred Fifty Seven";
        System.out.println("Input : " + input3);
        System.out.println("Output : " + convert(input3));

        // Example 4
        String input4 = "Zero";
        System.out.println("Input : " + input4);
        System.out.println("Output : " + convert(input4));
    }

}