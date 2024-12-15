/**
 * The new stripIndent() method simplifies handling indented multi-line strings.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
public class StripIndentExample {
    public static void main(String[] args) {
        String indented = """
                {
                    "name": "John",
                    "age": 25
                }
                """;

        System.out.println(indented.stripIndent());
    }
}