package com.sid.tricky_programs;

/**
 * Problem Definition: Find the length of the longest substring without repeating characters.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, m)) where n is the length of the string and m is the size of the character set.
 *
 * @author Siddhant Patni
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }
}