package com.sid.date_operations;

import java.time.Year;

/**
 * @author Siddhant Patni
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;

        boolean isLeap = Year.isLeap(year);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}