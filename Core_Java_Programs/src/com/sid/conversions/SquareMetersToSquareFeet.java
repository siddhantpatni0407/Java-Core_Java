package com.sid.conversions;

import java.util.Scanner;

public class SquareMetersToSquareFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square meters: ");
        double squareMeters = scanner.nextDouble();
        scanner.close();

        double squareFeet = convertSquareMetersToSquareFeet(squareMeters);
        System.out.println("Area in square feet: " + squareFeet);
    }

    private static double convertSquareMetersToSquareFeet(double squareMeters) {
        return squareMeters * 10.7639;
    }

}