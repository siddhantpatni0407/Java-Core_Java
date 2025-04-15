/**
 * Leetcode Problem 1 : Two Sum
 * Link : https://leetcode.com/problems/two-sum/description/
 * <p>
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 * <p>
 * Assumptions:
 * - Each input has exactly one solution.
 * - The same element may not be used twice.
 * <p>
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * <p>
 */

package com.sid.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Solves the Two Sum problem using HashMap for efficient lookup.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * <p>
 * Author: Siddhant Patni
 */
public class TwoSum_1 {

    /**
     * Finds indices of two numbers that add up to the target.
     *
     * @param nums   the input array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> foundSet = new HashMap<>();

        int[] returns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int now = nums[i];
            Integer lookingfor = target - now;
            if (foundSet.containsKey(lookingfor)) {
                returns[0] = foundSet.get(lookingfor);
                returns[1] = i;
                return returns;
            } else {
                foundSet.put(now, i);
            }
        }
        return returns;
    }

    public static void main(String[] args) {
        TwoSum_1 ts = new TwoSum_1();

        int[][] testCases = {
                {2, 7, 11, 15},
                {1, 2, 3},
                {3, 3},
                {0, 4, 3, 0}
        };
        int[] targets = {9, 5, 6, 0};

        for (int i = 0; i < testCases.length; i++) {
            try {
                int[] result = ts.twoSum(testCases[i], targets[i]);
                System.out.println("Input: " + Arrays.toString(testCases[i]) +
                        ", Target: " + targets[i] +
                        " → Output: " + Arrays.toString(result));
            } catch (IllegalArgumentException e) {
                System.out.println("Input: " + Arrays.toString(testCases[i]) +
                        ", Target: " + targets[i] +
                        " → " + e.getMessage());
            }
        }
    }

}