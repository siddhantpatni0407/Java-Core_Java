/**
 * Problem statement - Size of the List.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListSizeExample {

    public static void main(String[] args) {
        // Create a List and add elements
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");

        // Get the size of the List
        System.out.println("Number of countries in the list: " + countries.size());
    }

}