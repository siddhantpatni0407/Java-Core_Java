package com.sid.conversions;

import java.util.Scanner;

public class KelvinToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        scanner.close();

        double fahrenheit = convertKelvinToFahrenheit(kelvin);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    private static double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

}