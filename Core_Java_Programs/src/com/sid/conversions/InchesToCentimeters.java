package com.sid.conversions;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        scanner.close();

        double centimeters = convertInchesToCentimeters(inches);
        System.out.println("Length in centimeters: " + centimeters);
    }

    private static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

}