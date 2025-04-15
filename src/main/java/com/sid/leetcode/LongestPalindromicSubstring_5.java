/**
 * LeetCode Problem #5: Longest Palindromic Substring
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Link : https://leetcode.com/problems/longest-palindromic-substring/
 * <p>
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */

package com.sid.leetcode;

import java.util.Arrays;

public class LongestPalindromicSubstring_5 {

    /**
     * Approach 1: Expand Around Center (Basic)
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * @param s Input string
     * @return Longest palindromic substring
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int length = s.length();
        char[] chars = s.toCharArray();
        String longest = "";

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 2; j++) {
                int left = i;
                int right = i + j;

                while (left >= 0 && right < length && chars[left] == chars[right]) {
                    left--;
                    right++;
                }

                left++;
                right--;

                if (right - left + 1 > longest.length()) {
                    longest = String.valueOf(Arrays.copyOfRange(chars, left, right + 1));
                }
            }
        }

        return longest;
    }

    // Variables used in Approach 2
    private int lo, maxLen;

    /**
     * Approach 2: Expand Around Center (Optimized with helper method)
     * Source: https://discuss.leetcode.com/topic/23498/very-simple-clean-java-solution
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * @param s Input string
     * @return Longest palindromic substring
     */
    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2) return s;  // Edge case for strings of length 1

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);  // Assume odd length, try to extend palindrome as possible
            extendPalindrome(s, i, i + 1); // Assume even length palindrome.
        }

        return s.substring(lo, Math.min(lo + maxLen, len));  // Fix for index out of bounds
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    /**
     * Approach 3: Dynamic Programming (Top-down)
     * Source: https://leetcode.com/problems/longest-palindromic-substring/discuss/2921/Share-my-Java-solution-using-dynamic-programming
     * Time Complexity: O(n^2)
     * Space Complexity: O(n^2)
     *
     * @param s Input string
     * @return Longest palindromic substring
     */
    public String longestPalindrome3(String s) {
        int n = s.length();
        String result = null;
        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (result == null || j - i + 1 > result.length())) {
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }

    /**
     * Approach 4: Dynamic Programming with Length Tracking
     * Time Complexity: O(n^2)
     * Space Complexity: O(n^2)
     *
     * @param s Input string
     * @return Longest palindromic substring
     */
    public String longestPalindrome4(String s) {
        if (s == null || s.length() <= 1) return s;  // Handling edge cases

        int N = s.length();
        int[][] dp = new int[N][N];

        char[] chars = s.toCharArray();
        int end = -1;
        int len = Integer.MIN_VALUE;

        for (int i = N - 1; i >= 0; i--) {
            for (int j = i; j < N; j++) {
                if (i == j) {
                    dp[i][j] = 1;  // Single character is always a palindrome
                } else if (i == j - 1) {
                    dp[i][j] = chars[i] == chars[j] ? 2 : 1;  // Two consecutive characters
                } else {
                    // Checking if the characters match and if the inner substring is a palindrome
                    if (chars[i] == chars[j] && dp[i + 1][j - 1] == (j - i - 1)) {
                        dp[i][j] = j - i + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
                    }
                }

                if (dp[i][j] > len) {
                    len = dp[i][j];
                    end = j;
                }
            }
        }
        return s.substring(end + 1 - len, end + 1);
    }

    /**
     * Approach 5: Clean Expand Around Center with Helper
     * Source: https://leetcode.com/problems/longest-palindromic-substring/solution/
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * @param s Input string
     * @return Longest palindromic substring
     */
    public String longestPalindrome5(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int lenOdd = expandFromCenter(s, i, i);       // odd length
            int lenEven = expandFromCenter(s, i, i + 1);  // even length
            int len = Math.max(lenOdd, lenEven);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Helper method to expand around a center and calculate the length of the palindrome.
     *
     * @param s     Input string
     * @param left  Left index
     * @param right Right index
     * @return Length of the palindrome
     */
    private int expandFromCenter(String s, int left, int right) {
        int L = left, R = right;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R - L - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring_5 solver = new LongestPalindromicSubstring_5();

        String[] testCases = {
                "babad",      // Expected: "bab" or "aba"
                "cbbd",       // Expected: "bb"
                "a",          // Expected: "a"
                "ac",         // Expected: "a" or "c"
                "racecar",    // Expected: "racecar"
                "",           // Expected: ""
                "forgeeksskeegfor", // Expected: "geeksskeeg"
                "abccba"      // Expected: "abccba"
        };

        System.out.println("Testing longestPalindrome methods on sample inputs:\n");

        for (String input : testCases) {
            System.out.println("Input: \"" + input + "\"");
            System.out.println("Approach 1: " + solver.longestPalindrome(input));
            System.out.println("Approach 2: " + solver.longestPalindrome2(input));
            System.out.println("Approach 3: " + solver.longestPalindrome3(input));
            System.out.println("Approach 4: " + solver.longestPalindrome4(input));
            System.out.println("Approach 5: " + solver.longestPalindrome5(input));
            System.out.println("--------------------------------------------------");
        }
    }

}