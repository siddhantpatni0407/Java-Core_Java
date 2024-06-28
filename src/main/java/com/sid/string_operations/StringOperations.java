/**
 * Problem statement - Perform various string operations
 */
package com.sid.string_operations;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1.concat("def"));
        System.out.println(str2.concat("def"));
        System.out.println(str1.concat("def").hashCode());
        System.out.println(str2.concat("def").hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.equals(str2));
    }
}