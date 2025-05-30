/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * Return the max sliding window.
 * Example 1:
 * <p>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * Constraints:
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */

package com.sid.leetcode.hard;

import java.util.*;

/**
 * @author Siddhant Patni
 */
public class SlidingWindowMaximum_239 {

    // Approach 1: Using Deque (Optimal: O(n))
    public static int[] maxSlidingWindowDeque(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offer(i);

            if (i >= k - 1)
                result[i - k + 1] = nums[dq.peek()];
        }
        return result;
    }

    // Approach 2: Using PriorityQueue (Max Heap)
    public static int[] maxSlidingWindowHeap(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max heap

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});

            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            if (i >= k - 1)
                result[i - k + 1] = pq.peek()[0];
        }
        return result;
    }

    // Approach 3: Brute Force (O(n*k))
    public static int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        return result;
    }

    // Approach 4: Using TreeMap
    public static int[] maxSlidingWindowTreeMap(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i >= k) {
                int out = nums[i - k];
                if (map.get(out) == 1) {
                    map.remove(out);
                } else {
                    map.put(out, map.get(out) - 1);
                }
            }

            if (i >= k - 1)
                result[i - k + 1] = map.lastKey();
        }

        return result;
    }

    public static void runAllApproaches(int[] nums, int k) {
        System.out.println("\nInput: " + Arrays.toString(nums) + " | Window Size: " + k);
        System.out.println("Deque Approach:       " + Arrays.toString(maxSlidingWindowDeque(nums, k)));
        System.out.println("Max Heap Approach:    " + Arrays.toString(maxSlidingWindowHeap(nums, k)));
        System.out.println("Brute Force Approach: " + Arrays.toString(maxSlidingWindowBruteForce(nums, k)));
        System.out.println("TreeMap Approach:     " + Arrays.toString(maxSlidingWindowTreeMap(nums, k)));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;

        int[] nums2 = {1};
        int k2 = 1;

        int[] nums3 = {9, 10, 9, -7, -4, -8, 2, -6};
        int k3 = 5;

        runAllApproaches(nums1, k1);
        runAllApproaches(nums2, k2);
        runAllApproaches(nums3, k3);
    }

}