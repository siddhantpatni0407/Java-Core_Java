package com.sid.conversions;

import java.util.Scanner;

public class KelvinToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        scanner.close();

        double celsius = convertKelvinToCelsius(kelvin);
        System.out.println("Temperature in Celsius: " + celsius);
    }

    private static double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}