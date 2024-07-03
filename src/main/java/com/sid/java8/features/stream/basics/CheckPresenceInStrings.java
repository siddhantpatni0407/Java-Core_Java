package com.sid.java8.features.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class CheckPresenceInStrings {

    public static void main(String[] args) {

        String str1 = "C - Cardio , M - MRI,  U - Ultrasound ";
        String str2 = "U - Ultrasound ";

        List<String> trimmedList1 = Arrays.stream(str1.split(","))
                .map(String::trim)
                .toList();

        List<String> trimmedList2 = Arrays.stream(str2.split(","))
                .map(String::trim)
                .toList();

        for (String str : trimmedList2) {
            if (trimmedList1.contains(str)) {
                System.out.println("Present");
            } else {
                System.out.println("Not - Present");
            }

        }
    }

}