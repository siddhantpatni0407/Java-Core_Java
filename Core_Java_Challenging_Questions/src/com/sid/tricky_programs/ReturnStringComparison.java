/**
 * Problem statement - Write a program to return boolean value on string comparison.
 * Satisfy below conditions:
 * No null pointer exception
 * No null check
 * No local variable
 * No exception handling
 */
package com.sid.tricky_programs;

public class ReturnStringComparison {
    public static boolean returnResult(String str) {
        if ("pqr".equals(str))  // always use hardcoded value in first part of equals so that no need to put null condition
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(returnResult("abc"));
        System.out.println(returnResult(null)); // ideally it should throw NPE but we added condition line no. 15 without handling exception.
    }
}