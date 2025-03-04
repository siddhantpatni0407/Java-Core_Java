/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that:
 * i, j, and k are distinct indices,
 * nums[i] + nums[j] + nums[k] == 0.
 * The solution set must not contain duplicate triplets.
 * <p>
 * Input	: nums = [-1,0,1,2,-1,-4]
 * Output	: [ [-1,-1,2], [-1,0,1] ]
 */

package com.sid.interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class Program7 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to use two-pointer approach

        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Skip duplicate values to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++; // Move left pointer to increase sum
                } else {
                    right--; // Move right pointer to decrease sum
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

}


/**
 * Step-by-Step Breakdown:
 * <p>
 * Step 1: Sorting the Array
 * Sorting is necessary to efficiently use the two-pointer technique.
 * Sorting takes O(N log N) time complexity.
 * <p>
 * Step 2: Iterating Through Each Element
 * We fix nums[i] as the first element and look for two other numbers such that their sum equals -nums[i].
 * The loop runs O(N) times.
 * <p>
 * Step 3: Two-pointer Technique
 * We use two pointers (left and right) to find a valid triplet.
 * This runs in O(N) for each fixed element.
 * <p>
 * Step 4: Avoiding Duplicates
 * We skip duplicate numbers using if (nums[i] == nums[i - 1]) continue; to avoid redundant triplets.
 * <p>
 * Time Complexity Analysis
 * <p>
 * Sorting the array → O(N log N)
 * Iterating through each element (i) → O(N)
 * Two-pointer technique → O(N)
 * Total Complexity = O(N log N + N²) ≈ O(N²)
 * <p>
 * Space Complexity Analysis
 * <p>
 * Sorting is done in-place → O(1)
 * Result storage in List<List<Integer>> → O(K), where K is the number of unique triplets.
 * Total Space Complexity = O(K)
 * <p>
 * Final Complexity Summary:
 * <p>
 * Operation	Complexity
 * Sorting	O(N log N)
 * Iterating + Two-pointers	O(N²)
 * Overall Complexity	O(N²)
 * Space Complexity	O(K) (Output storage)
 * <p>
 * Why is this optimal?
 * Brute force takes O(N³), but the two-pointer method improves it to O(N²).
 * Sorting helps avoid extra computations, making it efficient.
 */