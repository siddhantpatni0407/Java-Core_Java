package com.sid.java8.features.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Siddhant Patni
 */
public class PeriodExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996, 7, 4);

        Period period = Period.between(birthday, today);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}