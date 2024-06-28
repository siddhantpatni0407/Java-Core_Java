package com.sid.conversions;

import java.util.Scanner;

public class FahrenheitToKelvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();

        double kelvin = convertFahrenheitToKelvin(fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    private static double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

}