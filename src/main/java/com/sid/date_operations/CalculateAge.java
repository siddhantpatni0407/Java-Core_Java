package com.sid.date_operations;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Siddhant Patni
 */
public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1996, 7, 4);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
    }
}