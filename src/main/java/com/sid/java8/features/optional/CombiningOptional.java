package com.sid.java8.features.optional;

import java.util.Optional;

/**
 * @author Siddhant Patni
 */
public class CombiningOptional {
    public static void main(String[] args) {
        Optional<String> firstName = Optional.of("John");
        Optional<String> lastName = Optional.of("Doe");

        Optional<String> fullName = firstName.flatMap(fName -> lastName.map(lName -> fName + " " + lName));

        fullName.ifPresent(name -> System.out.println("Full Name: " + name));
    }
}