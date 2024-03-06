package com.sid.conversions;

import java.util.Scanner;

public class MetersToInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        scanner.close();

        double inches = convertMetersToInches(meters);
        System.out.println("Length in inches: " + inches);
    }

    private static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

}