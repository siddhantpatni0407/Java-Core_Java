/**
 * Problem statement - Write a program to return sum of prime numbers
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class SumOfPrimeNumbers {
    public static int returnSumOfPrimeNumbers(int inputFromNumber, int inputToNumber) {
        int count, sumOfPrimeNumbers = 0;
        for (int number = inputFromNumber; number <= inputToNumber; number++) {
            count = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                sumOfPrimeNumbers = sumOfPrimeNumbers + number;
            }
        }
        return sumOfPrimeNumbers;
    }

    public static void main(String args[]) {
        int inputFromNumber = 1;
        int inputToNumber = 10;
        System.out.println("The Sum of Prime Numbers from " + inputFromNumber + " to " + inputToNumber + " is : " + returnSumOfPrimeNumbers(inputFromNumber, inputToNumber));
    }
}