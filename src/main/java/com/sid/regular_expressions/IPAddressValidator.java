package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class IPAddressValidator {

    public static void main(String[] args) {

        String ipAddress = "192.168.1.1";
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println(ipAddress + " is a valid IP address.");
        } else {
            System.out.println(ipAddress + " is not a valid IP address.");
        }
    }

}