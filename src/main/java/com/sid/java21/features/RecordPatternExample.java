/**
 * Record patterns allow pattern matching to deconstruct record objects.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
record Persons(String name, int age) {}

public class RecordPatternExample {
    public static void main(String[] args) {
        Object obj = new Persons("John", 30);

        if (obj instanceof Persons(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}