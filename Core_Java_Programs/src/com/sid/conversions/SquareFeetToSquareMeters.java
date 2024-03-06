package com.sid.conversions;

import java.util.Scanner;

public class SquareFeetToSquareMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square feet: ");
        double squareFeet = scanner.nextDouble();
        scanner.close();

        double squareMeters = convertSquareFeetToSquareMeters(squareFeet);
        System.out.println("Area in square meters: " + squareMeters);
    }

    private static double convertSquareFeetToSquareMeters(double squareFeet) {
        return squareFeet / 10.7639;
    }

}