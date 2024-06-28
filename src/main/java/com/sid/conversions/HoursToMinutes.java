package com.sid.conversions;

import java.util.Scanner;

public class HoursToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        double hours = scanner.nextDouble();
        scanner.close();

        double minutes = convertHoursToMinutes(hours);
        System.out.println("Time in minutes: " + minutes);
    }

    private static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }

}