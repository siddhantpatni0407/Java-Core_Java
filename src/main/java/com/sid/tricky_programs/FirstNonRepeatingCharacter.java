package com.sid.tricky_programs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Siddhant Patni
 */
public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Step 1: Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if no unique character found
    }

    public static void main(String[] args) {
        String input = "aabbcdec";
        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

}