/**
 * Given an array of integer temperatures represents the daily temperatures, return an array answer such that answer[i]
 * is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which
 * this is possible, keep answer[i] == 0 instead.
 * Input:temperatures = [73,76,75,71,69,72,76,73]
 * Output:[1,0,4,2,1,1,0,0]
 */

package com.sid.interview_questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Program32 {

    // Approach 1: Brute Force - Time: O(n^2)
    public static int[] dailyTemperaturesBruteForce(int[] temps) {
        int[] answer = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            for (int j = i + 1; j < temps.length; j++) {
                if (temps[j] > temps[i]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }

    // Approach 2: Monotonic Stack - Time: O(n)
    public static int[] dailyTemperaturesStack(int[] temps) {
        int[] answer = new int[temps.length];
        Deque<Integer> stack = new ArrayDeque<>(); // stack to keep indices

        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 76, 75, 71, 69, 72, 76, 73};

        // Call Brute Force
        int[] result1 = dailyTemperaturesBruteForce(temperatures);
        System.out.println("Brute Force Result: " + Arrays.toString(result1));

        // Call Stack Approach
        int[] result2 = dailyTemperaturesStack(temperatures);
        System.out.println("Stack-Based Result: " + Arrays.toString(result2));
    }

}