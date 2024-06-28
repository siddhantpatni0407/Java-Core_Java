package com.sid.conversions;

import java.util.Scanner;

public class CentimetersToInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();
        scanner.close();

        double inches = convertCentimetersToInches(centimeters);
        System.out.println("Length in inches: " + inches);
    }

    private static double convertCentimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

}