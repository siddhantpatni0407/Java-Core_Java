/**
 * The SequencedMap interface allows you to access entries in insertion order, from both ends.
 */

package com.sid.java21.features;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

/**
 * @author Siddhant Patni
 */
public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<String, Integer> sequencedMap = new LinkedHashMap<>();
        sequencedMap.put("First", 1);
        sequencedMap.put("Second", 2);
        sequencedMap.put("Third", 3);

        // Get the first and last entries
        System.out.println("First entry: " + sequencedMap.firstEntry());
        System.out.println("Last entry: " + sequencedMap.lastEntry());
    }
}