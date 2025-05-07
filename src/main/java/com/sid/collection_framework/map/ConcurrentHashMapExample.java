package com.sid.collection_framework.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Siddhant Patni
 */
public class ConcurrentHashMapExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1 to add data into the map
        Thread thread1 = new Thread(() -> {
            map.put("One", 1);
            map.put("Two", 2);
            System.out.println("Thread 1 added: One=1, Two=2");
        });

        // Thread 2 to modify existing data in the map
        Thread thread2 = new Thread(() -> {
            map.put("Three", 3);
            map.replace("Two", 22); // Replaces value for the existing key "Two"
            System.out.println("Thread 2 added: Three=3, modified: Two=22");
        });

        // Thread 3 to read data from the map
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 read: Two=" + map.get("Two"));
            System.out.println("Thread 3 read: One=" + map.get("One"));
        });

        // Thread 4 to remove data from the map
        Thread thread4 = new Thread(() -> {
            map.remove("One");
            System.out.println("Thread 4 removed: One");
        });

        // Thread 5 to compute a value if absent
        Thread thread5 = new Thread(() -> {
            map.computeIfAbsent("Four", key -> 4);
            System.out.println("Thread 5 computed: Four=4 if absent");
        });

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        // Final output of the map after all operations
        System.out.println("\nFinal map content:");
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }

}