/**
 * Leetcode Problem 3 : Longest Substring Without Repeating Characters
 * Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Examples:
 * "abcabcbb" → "abc" → 3
 * "bbbbb" → "b" → 1
 * "pwwkew" → "wke" → 3
 * <p>
 * Author: Siddhant Patni
 */
package com.sid.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    // Approach 1 - With manual removal
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();

        int start = 0, maxLen = 1;
        Map<Character, Integer> found = new HashMap<>();
        found.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (found.containsKey(ch)) {
                int newStart = remove(start, i, ch, found, s);
                maxLen = Math.max(maxLen, i - start);
                start = newStart;
            } else {
                found.put(ch, i);
            }
        }

        return Math.max(maxLen, s.length() - start);
    }

    private int remove(int start, int now, char re, Map<Character, Integer> found, String s) {
        int j;
        for (j = start; j < now; j++) {
            char ch = s.charAt(j);
            found.remove(ch);
            if (ch == re) break;
        }
        found.put(s.charAt(now), now);
        return j + 1;
    }

    // Approach 2 - Clean sliding window using HashMap
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    // Approach 3 - Array-based lookup (ASCII 256)
    public int lengthOfLongestSubstring3(String s) {
        int[] map = new int[256];
        for (int i = 0; i < map.length; i++) map[i] = -1;

        int max = 0, pos = -1;
        for (int i = 0; i < s.length(); i++) {
            pos = Math.max(pos, map[s.charAt(i)]);
            max = Math.max(max, i - pos);
            map[s.charAt(i)] = i;
        }
        return max;
    }

    // Approach 4 - Optimized sliding window
    public int lengthOfLongestSubstring4(String s) {
        if (s == null || s.length() == 0) return 0;

        int[] map = new int[256];
        int left = 0, right = 0, maxLen = 0;
        char[] chars = s.toCharArray();

        while (right < s.length()) {
            char curr = chars[right++];
            map[curr]++;
            if (map[curr] == 1) {
                maxLen = Math.max(maxLen, right - left);
            }
            while (map[curr] > 1) {
                char leftChar = chars[left++];
                map[leftChar]--;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_3 solver = new LongestSubstringWithoutRepeatingCharacters_3();

        String[] testCases = {
                "abcabcbb",   // Expected: 3 ("abc")
                "bbbbb",      // Expected: 1 ("b")
                "pwwkew",     // Expected: 3 ("wke")
                "",           // Expected: 0
                "a",          // Expected: 1
                "abcdef",     // Expected: 6
                "abba",       // Expected: 2 ("ab" or "ba")
                "dvdf",       // Expected: 3 ("vdf")
                "tmmzuxt"     // Expected: 5 ("mzuxt")
        };

        System.out.println("=== Longest Substring Without Repeating Characters ===");
        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Approach 1: " + solver.lengthOfLongestSubstring(testCase));
            System.out.println("Approach 2: " + solver.lengthOfLongestSubstring2(testCase));
            System.out.println("Approach 3: " + solver.lengthOfLongestSubstring3(testCase));
            System.out.println("Approach 4: " + solver.lengthOfLongestSubstring4(testCase));
            System.out.println("--------------------------------------------------");
        }
    }

}