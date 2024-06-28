package com.sid.conversions;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        scanner.close();

        double meters = convertInchesToMeters(inches);
        System.out.println("Length in meters: " + meters);
    }

    private static double convertInchesToMeters(double inches) {
        return inches / 39.3701;
    }

}