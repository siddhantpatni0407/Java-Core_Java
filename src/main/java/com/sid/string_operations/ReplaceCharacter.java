package com.sid.string_operations;

/**
 * Program to replace a character in a string.
 *
 * @author Siddhant Patni
 */
public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacement: " + replacedStr);
    }
}