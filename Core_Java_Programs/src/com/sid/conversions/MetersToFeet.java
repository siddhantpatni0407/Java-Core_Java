package com.sid.conversions;

import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        scanner.close();

        double feet = convertMetersToFeet(meters);
        System.out.println("Length in feet: " + feet);
    }

    private static double convertMetersToFeet(double meters) {
        return meters / 0.3048;
    }

}