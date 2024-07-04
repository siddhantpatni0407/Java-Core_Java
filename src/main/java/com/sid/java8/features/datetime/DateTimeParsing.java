package com.sid.java8.features.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class DateTimeParsing {
    public static void main(String[] args) {
        String dateStr = "01-01-2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed Date: " + date);
    }
}