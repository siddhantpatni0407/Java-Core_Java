package com.sid.hackerrank;

import java.util.*;

public class DNSCache {

    public static List<Integer> getMinTime(int cache_Size, int cache_time, int server_time, List<String> urls) {

        // Initialize cache and time variables
        HashMap<String, Integer> cache = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int totalTime = 0;
        // Process each URL
        for (int i = 0; i < urls.size(); i++) {
            // Check if URL is in cache
            if (cache.containsKey(urls)) {
                totalTime += Math.min(cache_time, cache.get(urls)); // Use cache if possible
            } else {
                totalTime += server_time; // Otherwise, fetch from server
            }
            // Update cache
            cache.put(String.valueOf(urls), server_time);
            // Remove oldest URL from cache if cache is full
            if (cache.size() > cache_Size) {
                int oldestTime = Integer.MAX_VALUE;
                String oldestUrl = "";
                for (Map.Entry<String, Integer> entry : cache.entrySet()) {
                    if (entry.getValue() < oldestTime) {
                        oldestTime = entry.getValue();
                        oldestUrl = entry.getKey();
                    }
                }
                cache.remove(oldestUrl);
            }
            // Print total time
            result.add(totalTime);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMinTime(4, 3, 2, Collections.singletonList("www.google.com")));
    }

}