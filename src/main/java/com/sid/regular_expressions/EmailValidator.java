package com.sid.regular_expressions;

import java.util.regex.*;

/**
 * @author Siddhant Patni
 */
public class EmailValidator {

    public static void main(String[] args) {

        String email = "siddhant4patni@example.com";
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }

}