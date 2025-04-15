/**
 * LeetCode Problem 10 : Regular Expression Matching
 * Link: https://leetcode.com/problems/regular-expression-matching/
 * Implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * <p>
 * <p>
 * Examples:
 * isMatch("aa", "a") → false
 * isMatch("aa", "aa") → true
 * isMatch("aaa", "aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */

package com.sid.leetcode.hard;

public class RegularExpressionMatching_10 {

    /**
     * Recursive solution with substring (inefficient for large inputs).
     */
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();

        boolean firstMatch = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return isMatch(text, pattern.substring(2)) || (firstMatch && isMatch(text.substring(1), pattern));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    /**
     * Recursive with indexes (more efficient than substring version).
     */
    public boolean isMatch2(String text, String pattern) {
        return isMatchHelper(0, 0, text, pattern);
    }

    private boolean isMatchHelper(int i, int j, String text, String pattern) {
        if (j == pattern.length()) return i == text.length();

        boolean firstMatch = (i < text.length() &&
                (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            return isMatchHelper(i, j + 2, text, pattern) || (firstMatch && isMatchHelper(i + 1, j, text, pattern));
        } else {
            return firstMatch && isMatchHelper(i + 1, j + 1, text, pattern);
        }
    }

    /**
     * Bottom-up DP solution using 2D array.
     */
    public boolean isMatch3(String text, String pattern) {
        int textLen = text.length();
        int pattLen = pattern.length();
        boolean[][] dp = new boolean[textLen + 1][pattLen + 1];

        dp[0][0] = true;

        // Handle empty text with pattern like a*, a*b*, etc.
        for (int j = 1; j <= pattLen; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= textLen; i++) {
            for (int j = 1; j <= pattLen; j++) {
                char currP = pattern.charAt(j - 1);
                if (currP == '.' || currP == text.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (currP == '*') {
                    char prevP = pattern.charAt(j - 2);
                    if (prevP == '.' || prevP == text.charAt(i - 1)) {
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }

        return dp[textLen][pattLen];
    }

    /**
     * Top-down recursive with memoization (uses enum Result for cache state).
     */
    enum Result {
        TRUE, FALSE
    }

    private Result[][] memo;

    public boolean isMatch4(String text, String pattern) {
        memo = new Result[text.length() + 1][pattern.length() + 1];
        return dp(0, 0, text, pattern);
    }

    private boolean dp(int i, int j, String text, String pattern) {
        if (memo[i][j] != null) return memo[i][j] == Result.TRUE;

        boolean ans;
        if (j == pattern.length()) {
            ans = i == text.length();
        } else {
            boolean firstMatch = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                ans = dp(i, j + 2, text, pattern) || (firstMatch && dp(i + 1, j, text, pattern));
            } else {
                ans = firstMatch && dp(i + 1, j + 1, text, pattern);
            }
        }

        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }

    /**
     * Optimized bottom-up DP using character switch-case.
     */
    public boolean isMatch5(String s, String p) {
        if (s == null || p == null) return false;

        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Pattern starts with a*, a*b*, etc.
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 2];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char patternChar = p.charAt(j - 1);
                if (patternChar == '.' || patternChar == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (patternChar == '*') {
                    char prev = p.charAt(j - 2);
                    dp[i][j] = dp[i][j - 2] || ((prev == '.' || prev == s.charAt(i - 1)) && dp[i - 1][j]);
                }
            }
        }

        return dp[m][n];
    }

    // Optional: Main method to test
    public static void main(String[] args) {
        RegularExpressionMatching_10 rem = new RegularExpressionMatching_10();
        System.out.println(rem.isMatch("aab", "c*a*b")); // true
        System.out.println(rem.isMatch3("mississippi", "mis*is*p*.")); // false
        System.out.println(rem.isMatch4("ab", ".*")); // true
        System.out.println(rem.isMatch5("aaa", "a*a")); // true
    }
}