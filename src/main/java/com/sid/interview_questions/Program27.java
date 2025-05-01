/**
 * Given a string, sort it in decreasing order based on the frequency of characters, with characters
 * that appear more frequently placed before those that appear less frequently. If there are multiple answers,
 * return any of them.
 */

package com.sid.interview_questions;

import java.util.*;

public class Program27 {

    // Approach 1: Using PriorityQueue (Max-Heap)
    public static String frequencySortUsingHeap(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create a max-heap based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }

    // Approach 2: Using Sorting with Map
    public static String frequencySortUsingMap(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Sort the characters by frequency (descending order)
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());  // Sorting by frequency in descending order

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        // Example 1
        String input1 = "tree";
        String output1Heap = frequencySortUsingHeap(input1);
        String output1Map = frequencySortUsingMap(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output using Heap: " + output1Heap);  // Output: "eert" or "eetr"
        System.out.println("Output using Map: " + output1Map);  // Output: "eert" or "eetr"

        // Example 2
        String input2 = "cccaaa";
        String output2Heap = frequencySortUsingHeap(input2);
        String output2Map = frequencySortUsingMap(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output using Heap: " + output2Heap);  // Output: "aaaccc" or "cccaaa"
        System.out.println("Output using Map: " + output2Map);  // Output: "aaaccc" or "cccaaa"

        // Example 3
        String input3 = "Aabb";
        String output3Heap = frequencySortUsingHeap(input3);
        String output3Map = frequencySortUsingMap(input3);
        System.out.println("Input: " + input3);
        System.out.println("Output using Heap: " + output3Heap);  // Output: "bbAa" or "bbaA"
        System.out.println("Output using Map: " + output3Map);  // Output: "bbAa" or "bbaA"
    }

}