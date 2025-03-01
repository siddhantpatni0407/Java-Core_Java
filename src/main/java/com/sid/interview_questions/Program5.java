/**
 * You need to implement a Java program that checks if a given string containing brackets ((), {}, []) is balanced. A string is considered balanced if:
 * <p>
 * Every opening bracket has a corresponding closing bracket.
 * Brackets are closed in the correct order.
 * Your method should return true if the brackets are balanced and false otherwise.
 */

package com.sid.interview_questions;

import java.util.*;

/**
 * @author Siddhant Patni
 */
public class Program5 {

    // Method to check if brackets are balanced
    public static boolean isBalanced1(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check and pop corresponding closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Method to check if brackets are balanced using replacement approach
    public static boolean isBalanced2(String str) {
        String previous;
        do {
            previous = str;
            str = str.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        } while (!str.equals(previous)); // Repeat until no more replacements occur

        return str.isEmpty(); // If empty, brackets were balanced
    }

    // Method to check if brackets are balanced using counters
    public static boolean isBalanced3(String str) {
        int roundCount = 0, curlyCount = 0, squareCount = 0;

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                    roundCount++;
                    break;
                case ')':
                    roundCount--;
                    break;
                case '{':
                    curlyCount++;
                    break;
                case '}':
                    curlyCount--;
                    break;
                case '[':
                    squareCount++;
                    break;
                case ']':
                    squareCount--;
                    break;
            }

            // If any count goes negative, brackets are mismatched
            if (roundCount < 0 || curlyCount < 0 || squareCount < 0) {
                return false;
            }
        }

        // All counts must be zero at the end
        return roundCount == 0 && curlyCount == 0 && squareCount == 0;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "({[]})",     // true
                "({[})]",     // false
                "((()))",     // true
                "{[()]}",     // true
                "({[}",       // false
                "[a + b] * (c - d)", // true
                "(]",         // false
                "{"           // false
        };

        // Verify test cases
        for (String test : testCases) {
            System.out.println("Input: " + test + " --> Balanced? " + isBalanced1(test));
        }
    }

}