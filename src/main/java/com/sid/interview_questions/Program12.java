/**
 * This program finds the first occurrence of a non-repeating character in a given string.
 * Example:
 * Input  : "aabbcdec"
 * Output : 'd'
 * <p>
 * Approach:
 * 1. Use a LinkedHashMap to count the frequency of each character while maintaining the order.
 * 2. Traverse the LinkedHashMap to find the first character with a frequency of 1.
 */

package com.sid.interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program12 {

    /**Approach - 1
     * Finds the first non-repeating character in the given input string.
     *
     * @param input The string to check.
     * @return The first non-repeating character, or null if all characters repeat.
     */
    public static Character findFirstNonRepeatingCharacter1(String input) {

        // LinkedHashMap is used to preserve the order of insertion
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Step 1: Count frequency of each character in the input string
        for (char ch : input.toCharArray()) {
            // getOrDefault returns the value if key exists, otherwise returns 0
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Iterate through the map to find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Found the first unique character
            }
        }

        // If no unique character found, return null
        return null;
    }

    /** Approach - 2
     * Finds the first non-repeating character in the given input string
     * by checking if the first and last index of each character are the same.
     *
     * @param input The input string
     * @return The first non-repeating character, or null if none found
     */
    public static Character findFirstNonRepeatingCharacter2(String input) {
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);

            // indexOf returns the first occurrence, lastIndexOf returns the last occurrence
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                return currentChar; // Found the first non-repeating character
            }
        }

        return null; // No unique character found
    }

    /**
     * Main method to test the functionality with example input.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        String input = "aabbcdec";
        Character result = findFirstNonRepeatingCharacter1(input);

        if (result != null) {
            System.out.println("First non-repeating character : " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

}