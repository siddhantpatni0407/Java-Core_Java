/**
 * Problem statement -
 * <p>
 * Your company assigns each customer a membership ID, and you are implementing a check digit for those IDs.
 * The check digit should be calculated by adding up all digits in each membership ID. If the result of the sum is a number with
 * more than a single digit, another iteration is required, and the digits of the result also should be added together. This process
 * should repeat until a single-digit number is calculated.
 * Complete the function checkdigits() to get the expected output
 * Only edit the function and not the existing code.
 * <p>
 * Sample Testcases:
 * <p>
 * checkdigits(55555) 	->7
 * checkdigits (222)	->6
 * checkdigits(1234) 	->1
 */
package com.sid.tricky_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class SumOfNumberToSingleDigit {
    public static int checkDigit(int inputNumber) {
        int resultSum = 0;
        while (inputNumber > 0 || resultSum > 9) {
            if (inputNumber == 0) {
                inputNumber = resultSum;
                resultSum = 0;
            }
            resultSum = resultSum + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        return resultSum;
    }

    public static void main(String[] args) {
        System.out.print("Enter number to covert it to single digit : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Result : " + checkDigit(number));
    }
}
