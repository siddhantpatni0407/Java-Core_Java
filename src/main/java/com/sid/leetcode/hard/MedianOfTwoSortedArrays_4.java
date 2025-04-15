/**
 * Leetcode Problem 4 : Median of Two Sorted Arrays
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * <p>
 * Example 1: nums1 = [1, 3], nums2 = [2] -> Median = 2.0
 * Example 2: nums1 = [1, 2], nums2 = [3, 4] -> Median = (2 + 3)/2 = 2.5
 */

package com.sid.leetcode.hard;

public class MedianOfTwoSortedArrays_4 {

    // Brute Force Inspired Two Pointer Merging (Simplified Logic)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge both sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        int mid = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[mid];
        }
    }

    // Optimized Binary Search Partition (O(log(min(m,n))))
    public double findMedianSortedArrays2(int[] A, int[] B) {
        int m = A.length, n = B.length;
        if (m > n) return findMedianSortedArrays2(B, A);  // Ensure A is smaller

        int low = 0, high = m, halfLen = (m + n + 1) / 2;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = halfLen - i;

            int ALeft = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
            int ARight = (i == m) ? Integer.MAX_VALUE : A[i];
            int BLeft = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
            int BRight = (j == n) ? Integer.MAX_VALUE : B[j];

            if (ALeft <= BRight && BLeft <= ARight) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(ALeft, BLeft) + Math.min(ARight, BRight)) / 2.0;
                } else {
                    return Math.max(ALeft, BLeft);
                }
            } else if (ALeft > BRight) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays_4 solver = new MedianOfTwoSortedArrays_4();

        int[][] testCases1 = {
                {1, 3},
                {1, 2},
                {0, 0},
                {},
                {2}
        };

        int[][] testCases2 = {
                {2},
                {3, 4},
                {0, 0},
                {1},
                {}
        };

        System.out.println("=== Median of Two Sorted Arrays ===");
        for (int i = 0; i < testCases1.length; i++) {
            int[] nums1 = testCases1[i];
            int[] nums2 = testCases2[i];
            System.out.println("Input: nums1 = " + java.util.Arrays.toString(nums1)
                    + ", nums2 = " + java.util.Arrays.toString(nums2));
            System.out.println("Brute Force Median: " + solver.findMedianSortedArrays(nums1, nums2));
            System.out.println("Optimized Binary Search Median: " + solver.findMedianSortedArrays2(nums1, nums2));
            System.out.println("--------------------------------------------------");
        }
    }

}