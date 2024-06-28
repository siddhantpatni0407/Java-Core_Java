package com.sid.conversions;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        scanner.close();

        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Decimal representation: " + decimal);
    }

    private static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Iterate through each character of the binary string, starting from the rightmost digit
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            // Convert character '0' or '1' to its numeric value
            int value = Character.getNumericValue(digit);

            // Update the decimal value by adding the current digit multiplied by 2 raised to the power of its position
            decimal += value * Math.pow(2, power);

            // Increment the power for the next iteration
            power++;
        }

        return decimal;
    }

}