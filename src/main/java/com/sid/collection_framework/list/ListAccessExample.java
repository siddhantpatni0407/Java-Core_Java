/**
 * Problem statement - Accessing Elements in List (ArrayList).
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListAccessExample {
    public static void main(String[] args) {
        // Create and initialize a List
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Accessing elements by index
        System.out.println("First color: " + colors.get(0));  // Output: Red
        System.out.println("Second color: " + colors.get(1)); // Output: Green
    }

}