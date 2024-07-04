/**
 * Problem statement - Write a program to return boolean value on string comparison.
 * Satisfy below conditions:
 * No null pointer exception
 * No null check
 * No local variable
 * No exception handling
 */
package com.sid.tricky_programs;

public class RemoveLeadingZeroFromString {

    public static String removeLeadingZeros1(String str) {
        return str.replaceAll("^0*", "");
    }

    public static String removeLeadingZeros2(String input) {
        return input.replaceFirst("^0+(?!$)", "");
    }

    public static String removeLeadingZeros3(String input) {
        int length = input.length();
        int nonZeroIndex = 0;

        // Find the index of the first non-zero character
        while (nonZeroIndex < length && input.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }

        // If all characters are zeros, return "0"
        if (nonZeroIndex == length) {
            return "0";
        }

        // Otherwise, return the substring starting from the first non-zero character
        return input.substring(nonZeroIndex);
    }

    public static String removeLeadingZeros4(String input) {
        int firstNonZeroIndex = (int) input.chars()
                .takeWhile(ch -> ch == '0')
                .count();

        return input.substring(firstNonZeroIndex);
    }

    public static void main(String[] args) {
        System.out.println("Output 1 : " + removeLeadingZeros1("00005712345"));
        System.out.println("Output 2 : " + removeLeadingZeros2("00005712345"));
        System.out.println("Output 3 : " + removeLeadingZeros3("00005712345"));
        System.out.println("Output 4 : " + removeLeadingZeros4("00005712345"));
    }

}