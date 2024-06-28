/**
 * Problem statement - Program to find the frequency of each element in the array
 */
package com.sid.tricky_programs;

import java.util.Arrays;

public class CountFrequencyOfElement {
    public static void countFrequency(int[] array) {
        //Array frequency will store frequencies of element
        int[] frequency = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    //To avoid counting same element again  
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
        }

        //Displays the frequency of each element present in array  
        System.out.println("Element -> Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited)
                System.out.println(array[i] + " -> " + frequency[i]);
        }
    }

    public static void countFreq(int[] array) {
        int n = array.length;
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        //Initialize array  
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 0, 0, 8, 2, 5, 1, 8};

        System.out.println("Methood - 1");
        countFrequency(arr);
        System.out.println("Methood - 2");
        countFreq(arr);


    }
}