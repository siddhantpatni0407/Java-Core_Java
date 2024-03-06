package com.sid.conversions;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        scanner.close();

        double meters = convertFeetToMeters(feet);
        System.out.println("Length in meters: " + meters);
    }

    private static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

}