package com.sid.external_librabry.apache_common_lang3.date_utils;


import org.apache.commons.lang3.time.DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Siddhant Patni
 */
public class DateUtilsDemo {

    public static void main(String[] args) {

        //Adding/Subtracting Time Units
        Date now = new Date();
        Date tomorrow = DateUtils.addDays(now, 1); // Adds one day to the current date
        System.out.println("tomorrow : " + tomorrow);

        //Truncating Dates
        Date truncatedDate = DateUtils.truncate(now, Calendar.DAY_OF_MONTH); // Truncates to the beginning of the day
        System.out.println("truncatedDate : " + truncatedDate);

        //Comparing Dates
        Date date1 = new Date();
        Date date2 = new Date();
        boolean isSameDay = DateUtils.isSameDay(date1, date2); // Checks if both dates are on the same day
        System.out.println("isSameDay : " + isSameDay);




    }
}