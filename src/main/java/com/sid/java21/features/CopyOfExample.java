/**
 * Creating immutable copies of a list with a tweak.
 */

package com.sid.java21.features;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class CopyOfExample {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        List<String> modifiedList = new ArrayList<>(list);
        modifiedList.add("D");

        List<String> copy = List.copyOf(modifiedList);

        System.out.println("Original: " + list);
        System.out.println("Modified: " + modifiedList);
        System.out.println("Immutable Copy: " + copy);
    }
}