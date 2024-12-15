/**
 * New SequencedCollection, SequencedSet, and SequencedMap interfaces add order-preserving features.
 */

package com.sid.java21.features;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

/**
 * @author Siddhant Patni
 */
public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedSet<String> sequencedSet = new LinkedHashSet<>();
        sequencedSet.addFirst("First");
        sequencedSet.addLast("Last");
        System.out.println(sequencedSet); // Output: [First, Last]
    }
}