package com.sid.basic_programs;

/**
 * @author Siddhant Patni
 */
public class LargestOfThree {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int num3 = 3;

        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Largest number: " + largest);
    }

}