package com.sid.utility;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class NullSafeUtil {

    public static String safeToString(Object obj) {
        return Optional
                .ofNullable(obj)
                .map(Object::toString)
                .orElse("N/A");
    }

    public static void main(String[] args) {
        String name = null;
        System.out.println("Safe Output: " + safeToString(name));  // N/A
    }

}