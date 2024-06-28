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

    public static String removeLeadingZeros(String str) {
        return str.replaceAll("^0*", "");
    }

    public static void main(String[] args) {
        System.out.println(removeLeadingZeros("00005712345"));
    }

}