/**
 * Given a non-empty array of integers nums.
 * every number appears twice except for one. Find the single one.
 */

package com.sid.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindSingleNumber {

    public static int singleNumber1(int[] nums) {

        if (nums.length == 1)
            return nums[0];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    /**
     * Using Bitwise XOR operation.
     */
    public static int singleNumber2(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 4, 8};
        System.out.println("Approach - 1 -> " + singleNumber1(nums));
        System.out.println("Approach - 2 -> " + singleNumber2(nums));
    }
}