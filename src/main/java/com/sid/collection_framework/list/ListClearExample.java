/**
 * Problem statement - Clearing a List.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListClearExample {
    public static void main(String[] args) {
        // Create a List and add elements
        List<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");

        // Clear the entire List
        sports.clear();

        // Check if the List is empty
        System.out.println("Is the sports list empty? " + sports.isEmpty());
    }

}