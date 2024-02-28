/**
 * Problem Statement :
 * Input: n = 4
 * Output: 5
 * <p>
 * Explanation:
 * You can reach 4th stair in 5 ways.
 * Way 1: Climb 2 stairs at a time.
 * Way 2: Climb 1 stair at a time.
 * Way 3: Climb 2 stairs, then 1 stair
 * and then 1 stair.
 * Way 4: Climb 1 stair, then 2 stairs
 * then 1 stair.
 * Way 5: Climb 1 stair, then 1 stair and
 * then 2 stairs.
 * <p>
 * Example 2:
 * Input:n = 10
 * Output: 89
 * <p>
 * Explanation: There are 89 ways to reach the 10th stair.
 * Your Task:
 * Complete the function countWays() which takes the top stair number m as input parameters and returns the answer % 10^9+7.
 * Expected Time Complexity : O(n)
 * Expected Auxiliary Space: O(1)
 */

package com.sid.tricky_programs;

public class FindNoOfWays {
    private static int countWays(int n) {
        //check if n is less than 1 or not, if yes then return 1
        if (n <= 1) {
            return 1;
        }
        int[] stairs = new int[n + 1];
        stairs[0] = 1;
        stairs[1] = 1;

        for (int i = 2; i <= n; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        return stairs[n];
    }

    public static void main(String[] args) {
        int n;
        n = 4;
        System.out.println("The number of ways to climb " + n + " the stairs is : " + countWays(n));

        n = 10;
        System.out.println("The number of ways to climb " + n + " the stairs is : " + countWays(n));
    }
}