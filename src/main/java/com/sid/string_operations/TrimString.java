package com.sid.string_operations;

/**
 * Program to remove leading and trailing spaces from a string.
 *
 * @author Siddhant Patni
 */
public class TrimString {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: " + trimmedStr);
    }
}