/**
 * Given an array nums and a target sum, find two numbers such that they add up to the target sum. Return their indices.
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9, so return [0, 1].
 */

package com.sid.interview_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Siddhant Patni
 */
public class Program8 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Key: number, Value: index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required number to reach target

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices if complement found
            }

            map.put(nums[i], i); // Store the number and its index
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target))); // Output: [0,1]
    }

}

/**
 * Explanation
 * Using a HashMap:
 * <p>
 * We store numbers as keys and their indices as values.
 * While iterating, we check if the difference (target - nums[i]) exists in the map.
 * If it exists, we return both indices.
 * Example Execution:
 * <p>
 * nums = [2, 7, 11, 15], target = 9
 * <p>
 * Iteration 1: i = 0, nums[i] = 2, complement = 9 - 2 = 7
 * → Store {2: 0} in map.
 * <p>
 * Iteration 2: i = 1, nums[i] = 7, complement = 9 - 7 = 2
 * → Found 2 in map! Return [0,1].
 * <p>
 * Time and Space Complexity
 * <p>
 * Operation	Complexity
 * HashMap Lookup	O(1)
 * Iteration through Array	O(N)
 * Overall Time Complexity	O(N)
 * Space Complexity	O(N) (For HashMap storage)
 * 🚀 This is the most efficient approach, as it avoids nested loops (O(N²)).
 */