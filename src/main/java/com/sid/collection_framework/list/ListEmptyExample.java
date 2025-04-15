/**
 * Problem statement - Checking if List is Empty.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListEmptyExample {

    public static void main(String[] args) {
        // Create an empty List
        List<String> vegetables = new ArrayList<>();

        // Check if the List is empty
        System.out.println("Is the vegetables list empty? " + vegetables.isEmpty());

        // Adding an element to the List
        vegetables.add("Carrot");

        // Check again if the List is empty
        System.out.println("Is the vegetables list empty now? " + vegetables.isEmpty());
    }

}