package com.sid.date_operations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class FormatDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = date.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}