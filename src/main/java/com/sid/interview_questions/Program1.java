/**
 * Write a java program to group a list of strings based on their lengths and count the number of strings in each group.
 * example if the input list is :
 * ["dog", "cat", "elephant", "rabbit", "fox", ""giraffe", "ant", "zebra", "owl"] and the
 * output should be :
 * String of length 3 : 4 Strings : ("dog", "cat", "fox", "owl")
 * String of length 4 : 1 String ("zebra")
 * String of length 6 : 2 String ("rabbit", "giraffe")
 * String of length 8 : 1 String ("elephant")
 */

package com.sid.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program1 {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("dog", "cat", "elephant", "rabbit", "fox", "giraffe", "ant", "zebra", "owl");

        // Grouping strings by their length
        Map<Integer, List<String>> groupedByLength = inputList
                .stream()
                .collect(Collectors.groupingBy(String::length));

        // Display the result

        /*groupedByLength.forEach((length, strings) -> {
            System.out.println("String of length " + length + " : " + strings.size() +
                    (strings.size() > 1 ? " Strings" : " String") + " : " + strings);
        });*/

        groupedByLength
                .forEach((length, strings) ->
                        System.out.println(STR."String of length \{length} : \{strings.size()}\{strings.size() > 1 ? " Strings" : " String"} : \{strings}"));
    }

}