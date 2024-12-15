/**
 * Switch statements now support pattern matching with null-safe checks.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
public class NullHandlingSwitch {
    public static void main(String[] args) {
        Object obj = null;

        String result = switch (obj) {
            case null -> "Object is null";
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}