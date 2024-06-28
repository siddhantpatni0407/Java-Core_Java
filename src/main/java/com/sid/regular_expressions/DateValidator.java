package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class DateValidator {

    public static void main(String[] args) {
        String date = "2024-06-28";
        String regex = "\\d{4}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            System.out.println(date + " is a valid date.");
        } else {
            System.out.println(date + " is not a valid date.");
        }
    }

}