package com.sid.date_operations;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Siddhant Patni
 */
public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2024;
        Month month = Month.FEBRUARY;

        int daysInMonth = LocalDate.of(year, month, 1).lengthOfMonth();
        System.out.println("Number of days in " + month + " " + year + ": " + daysInMonth);
    }
}