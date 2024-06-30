package com.sid.date_operations;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class DateRangeOverlap {
    public static void main(String[] args) {
        LocalDate start1 = LocalDate.of(2023, 1, 1);
        LocalDate end1 = LocalDate.of(2023, 6, 30);

        LocalDate start2 = LocalDate.of(2023, 5, 1);
        LocalDate end2 = LocalDate.of(2023, 12, 31);

        boolean isOverlap = !start1.isAfter(end2) && !start2.isAfter(end1);

        if (isOverlap) {
            System.out.println("The date ranges overlap.");
        } else {
            System.out.println("The date ranges do not overlap.");
        }
    }
}