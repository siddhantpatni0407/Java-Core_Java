package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class PasswordValidator {

    public static void main(String[] args) {

        String password = "P@ssw0rd";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println(password + " is a valid password.");
        } else {
            System.out.println(password + " is not a valid password.");
        }
    }

}