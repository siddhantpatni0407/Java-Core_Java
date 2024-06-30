package com.sid.date_operations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Siddhant Patni
 */
public class NextPreviousFriday {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDate nextFriday = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDate previousFriday = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        System.out.println("Next Friday: " + nextFriday);
        System.out.println("Previous Friday: " + previousFriday);
    }
}