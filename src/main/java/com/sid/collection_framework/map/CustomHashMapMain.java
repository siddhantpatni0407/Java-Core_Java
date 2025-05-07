package com.sid.collection_framework.map;

import java.util.LinkedList;

/**
 * @author Siddhant Patni
 */
class CustomHashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    // Entry class for storing key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the table
    public CustomHashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // Put method to insert key-value pair into the map
    public void put(K key, V value) {
        int index = getIndex(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Get method to retrieve value by key
    public V get(K key) {
        int index = getIndex(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // Return null if key doesn't exist
    }

    // Remove method to delete key-value pair
    public void remove(K key) {
        int index = getIndex(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    // Contains method to check if the map contains a key
    public boolean containsKey(K key) {
        int index = getIndex(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Size method to get the number of key-value pairs in the map
    public int size() {
        return size;
    }

    // Helper method to calculate the index of the key
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Method to print all key-value pairs in the map
    public void printMap() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }
}

public class CustomHashMapMain {

    public static void main(String[] args) {

        // Create a new instance of CustomHashMap
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Using the put method to add key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Print all key-value pairs
        System.out.println("All Key-Value Pairs:");
        map.printMap();

        // Retrieve value by key using get method
        System.out.println("\nValue for key 'Two': " + map.get("Two"));

        // Remove a key-value pair using remove method
        map.remove("Two");

        // Print all key-value pairs after removal
        System.out.println("\nAfter Removing 'Two':");
        map.printMap();

        // Check if a key exists using containsKey method
        System.out.println("\nDoes key 'Two' exist? " + map.containsKey("Two"));
        System.out.println("Does key 'Three' exist? " + map.containsKey("Three"));

        // Get the size of the map
        System.out.println("\nSize of the map: " + map.size());

        // Try to get a value for a non-existing key
        System.out.println("\nValue for non-existing key 'Five': " + map.get("Five"));
    }

}