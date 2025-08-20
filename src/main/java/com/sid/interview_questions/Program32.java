/**
 * Given an array of daily temperatures, it returns an array where each element
 * indicates the number of days until a warmer temperature. If no warmer day exists, the value is 0.
 *
 * <p>Example:
 * Input: temperatures = [73,76,75,71,69,72,76,73]
 * Output: [1,0,4,2,1,1,0,0]
 */
package com.sid.interview_questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Utility class providing solutions to the "Daily Temperatures" problem.
 * Given an array of daily temperatures, returns an array where each element
 * indicates the number of days until a warmer temperature. If no warmer day exists, the value is 0.
 *
 * <p>Example:
 * Input: temperatures = [73,76,75,71,69,72,76,73]
 * Output: [1,0,4,2,1,1,0,0]
 */
public final class Program32 {

    // Prevent instantiation
    private Program32() {
    }

    /**
     * Brute force approach: For each day, checks all subsequent days to find the next warmer temperature.
     *
     * @param temperatures array of daily temperatures
     * @return array where each element is the number of days until a warmer temperature
     */
    public static int[] dailyTemperaturesBruteForce(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Monotonic stack approach: Uses a stack to keep track of indices with unresolved warmer days.
     *
     * @param temperatures array of daily temperatures
     * @return array where each element is the number of days until a warmer temperature
     */
    public static int[] dailyTemperaturesStack(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }

    /**
     * Main method to demonstrate both approaches for the daily temperatures problem.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] temperatures = {73, 76, 75, 71, 69, 72, 76, 73};

        int[] bruteForceResult = dailyTemperaturesBruteForce(temperatures);
        System.out.println("Brute Force Result: " + Arrays.toString(bruteForceResult));

        int[] stackResult = dailyTemperaturesStack(temperatures);
        System.out.println("Stack-Based Result: " + Arrays.toString(stackResult));
    }
}
