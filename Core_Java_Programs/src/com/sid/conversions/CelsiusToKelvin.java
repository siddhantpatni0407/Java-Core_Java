package com.sid.conversions;

import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double kelvin = convertCelsiusToKelvin(celsius);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    private static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

}