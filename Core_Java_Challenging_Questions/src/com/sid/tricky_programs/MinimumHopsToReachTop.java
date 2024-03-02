/**
 * There is a stair having total no of statirs as n.
 * Requirement is to reach at the top in minimum hop.
 * Each step has some value associated to it which shows how many step you can move forward from that step.
 * Find the minimum hop required to reach from 0th step to nth step.
 * n= 6
 * stairs = {2,0,1,3,1,1};
 */
package com.sid.tricky_programs;

public class MinimumHopsToReachTop {

    public static int minHops(int[] stairs) {
        int n = stairs.length;
        int[] dp = new int[n];
        // Base case: Minimum hops required to reach the 0th step is 0
        dp[0] = 0;
        // Iterate over each step to calculate the minimum hops required
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE; // Initialize to a large value

            // Try all possible hops from previous steps to reach the current step
            for (int j = 0; j < i; j++) {
                // Check if it's possible to reach the current step from the previous step
                if (j + stairs[j] >= i) {
                    // Update the minimum hops required if it's shorter than the current value
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        // The minimum hops required to reach the top is the value at the last step
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] stairs = {2, 0, 1, 3, 1, 1};
        int n = stairs.length;
        System.out.println("Minimum hops required to reach the top: " + minHops(stairs)); // Output: 3
    }
}