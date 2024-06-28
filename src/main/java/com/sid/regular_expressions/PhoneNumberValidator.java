package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class PhoneNumberValidator {

    public static void main(String[] args) {
        String phoneNumber = "(123) 456-7890";
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println(phoneNumber + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number.");
        }
    }

}