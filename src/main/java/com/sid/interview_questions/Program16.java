/**
 * Palindrome String and Number using Java 8.
 */
package com.sid.interview_questions;

import java.util.stream.IntStream;

/**
 * @author Siddhant Patni
 */
public class Program16 {

    // Check if a string is palindrome using Java 8 Stream
    public static boolean isPalindromeString(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase(); // remove spaces, lowercase
        return IntStream.range(0, cleaned.length() / 2)
                .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length() - 1 - i));
    }

    // Check if a number is palindrome using Java 8
    public static boolean isPalindromeNumber(int number) {
        String numStr = String.valueOf(number);
        return IntStream.range(0, numStr.length() / 2)
                .allMatch(i -> numStr.charAt(i) == numStr.charAt(numStr.length() - 1 - i));
    }

    public static void main(String[] args) {
        // Test strings
        String testStr1 = "Racecar";
        String testStr2 = "Hello";

        System.out.println("\"" + testStr1 + "\" is Palindrome String? -> " + isPalindromeString(testStr1));
        System.out.println("\"" + testStr2 + "\" is Palindrome String? -> " + isPalindromeString(testStr2));

        // Test numbers
        int num1 = 121;
        int num2 = 12345;

        System.out.println(num1 + " is Palindrome Number? -> " + isPalindromeNumber(num1));
        System.out.println(num2 + " is Palindrome Number? -> " + isPalindromeNumber(num2));
    }

}