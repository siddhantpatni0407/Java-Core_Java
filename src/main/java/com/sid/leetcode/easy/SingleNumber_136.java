/**
 * LeetCode Problem 136 : Single Number
 * Link : https://leetcode.com/problems/single-number/
 * <p>
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 * <p>
 * Note:
 * - Your algorithm should have a linear runtime complexity.
 * - Could you implement it without using extra memory?
 *
 * @param nums The input array of integers.
 * @return The integer that appears only once in the array.
 */

package com.sid.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber_136 {

    /**
     * Approach 1: Sort the array and check for adjacent elements.
     *
     * @param nums The input array of integers.
     * @return The integer that appears only once in the array.
     */
    public int singleNumber(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Iterate through the array to find the single number
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            // Check if the current element is equal to the next or previous one
            if ((i > 0 && n == nums[i - 1]) || (i < nums.length - 1 && n == nums[i + 1])) {
                continue;
            }

            // Return the single element
            return nums[i];
        }
        return -1; // This line is unreachable since the problem guarantees a solution
    }

    /**
     * Approach 2: Use a HashSet to find the single number.
     *
     * @param nums The input array of integers.
     * @return The integer that appears only once in the array.
     */
    public int singleNumber2(int[] nums) {
        // Use a HashSet to store numbers and track single occurrence
        Set<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, remove it; otherwise, add it
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        // The remaining element in the set is the single number
        return set.iterator().next();
    }

    /**
     * Approach 3: Use XOR to find the single number in O(n) time and O(1) space.
     * XOR will cancel out the duplicate numbers and leave the single number.
     *
     * @param nums The input array of integers.
     * @return The integer that appears only once in the array.
     */
    public int singleNumber3(int[] nums) {
        int result = 0;

        // XOR all elements together
        for (int num : nums) {
            result ^= num;
        }

        // The result will be the single number
        return result;
    }

    /**
     * Main method to test the function.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        SingleNumber_136 singleNumber136 = new SingleNumber_136();

        // Test cases
        int[] nums1 = {4, 1, 2, 1, 2};
        System.out.println("Single Number (Approach 1): " + singleNumber136.singleNumber(nums1));
        System.out.println("Single Number (Approach 2): " + singleNumber136.singleNumber2(nums1));
        System.out.println("Single Number (Approach 3): " + singleNumber136.singleNumber3(nums1));

        int[] nums2 = {2, 2, 1};
        System.out.println("Single Number (Approach 1): " + singleNumber136.singleNumber(nums2));
        System.out.println("Single Number (Approach 2): " + singleNumber136.singleNumber2(nums2));
        System.out.println("Single Number (Approach 3): " + singleNumber136.singleNumber3(nums2));
    }

}