/**
 * Find Highest Odd Number
 * num = "5688248" output = "5"
 * num = "61632826" output = "6163"
 * num = "616338261" output = "616338261"
 */

package com.sid.interview_questions;

import java.util.stream.IntStream;

/**
 * @author Siddhant Patni
 */
public class Program2 {

    /**
     * Finds the highest odd number substring in the given numeric string.
     *
     * @param num the input numeric string
     * @return the highest odd number substring
     */
    public static String findHighestOddNumber1(String num) {
        for (int i = num.length(); i > 0; i--) {
            if (isOdd(Character.getNumericValue(num.charAt(i - 1)))) {
                return num.substring(0, i);
            }
        }
        return ""; // Return empty if no odd number is found
    }

    /**
     * Finds the highest odd number substring in the given numeric string using Streams.
     *
     * @param num the input numeric string
     * @return the highest odd number substring
     */
    public static String findHighestOddNumber2(String num) {
        // Find the last index of an odd digit
        int lastOddIndex = IntStream.range(0, num.length())
                .filter(i -> isOdd(Character.getNumericValue(num.charAt(i))))
                .max()
                .orElse(-1);

        // If no odd digit is found, return an empty string
        return lastOddIndex != -1 ? num.substring(0, lastOddIndex + 1) : "";
    }

    /**
     * Finds the highest odd number substring in the given numeric string by backward traversal.
     *
     * @param num the input numeric string
     * @return the highest odd number substring
     */
    public static String findHighestOddNumber3(String num) {
        // Traverse the string from the end to find the last odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(num.charAt(i));
            if (digit % 2 != 0) {
                // Return the substring from the start to the last odd digit
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }

    /**
     * Checks if a given number is odd.
     *
     * @param n the number to check
     * @return true if odd, false otherwise
     */
    private static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(findHighestOddNumber1("5688248"));     // Output: 5
        System.out.println(findHighestOddNumber1("61632826"));    // Output: 6163
        System.out.println(findHighestOddNumber1("616338261"));   // Output: 616338261
    }

}