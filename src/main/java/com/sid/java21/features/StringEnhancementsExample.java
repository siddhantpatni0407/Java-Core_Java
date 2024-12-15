/**
 * New methods like translateEscapes() and stripIndent() enhance string handling.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
public class StringEnhancementsExample {
    public static void main(String[] args) {
        String escapedString = "Hello\\nWorld";
        System.out.println(escapedString.translateEscapes()); // Output: Hello
        //         World

        String indentedString = "    Hello\n    World";
        System.out.println(indentedString.stripIndent()); // Output: Hello
        //         World
    }
}