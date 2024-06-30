package com.sid.date_operations;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 6, 30);
        LocalDate date2 = LocalDate.of(2024, 6, 30);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}