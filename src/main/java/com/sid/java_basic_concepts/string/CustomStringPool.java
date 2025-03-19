package com.sid.java_basic_concepts.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siddhant Patni
 */
public class CustomStringPool {

    // Simulating the String Pool using a HashMap
    private static final Map<String, String> stringPool = new HashMap<>();

    public static String intern(String str) {
        if (!stringPool.containsKey(str)) {
            stringPool.put(str, str); // Store only one instance
        }
        return stringPool.get(str);
    }

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = intern(s1); // Custom intern() method
        String s3 = "Hello"; // Already in pool

        System.out.println(s1 == s2); // false (s1 is in heap)
        System.out.println(s2 == s3); // true (same reference from pool)
    }


}