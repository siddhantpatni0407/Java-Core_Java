package com.sid.interview_questions;

/**
 * @author Siddhant Patni
 */
public class Program9 {
    public static String getSmallestString(String s) {
        int n = s.length();
        char minChar = s.charAt(0);
        int minIndex = 0;

        // Step 1: Find the lexicographically smallest character and its first occurrence
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i);
                minIndex = i;
            }
        }

        // Step 2: Construct the new string by moving minChar to the front
        StringBuilder result = new StringBuilder();
        result.append(minChar);
        result.append(s.substring(0, minIndex)); // Add prefix before minChar
        result.append(s.substring(minIndex + 1)); // Add suffix after minChar

        return result.toString();
    }

    public static void main(String[] args) {

        String s1 = "cab";
        String s2 = "aaaba";

        System.out.println(getSmallestString(s2)); // Print the result
    }

}