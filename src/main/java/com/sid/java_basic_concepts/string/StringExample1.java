package com.sid.java_basic_concepts.string;

/**
 * @author Siddhant Patni
 */
public class StringExample1 {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = s1.intern(); // Moves "Hello" to the string pool if not present

        System.out.println("s1 == s2" + s1 == s2); // false (Different memory references)
        System.out.println("s2 == s3" + s2 == s3); // true (Same reference from string pool)
    }

}