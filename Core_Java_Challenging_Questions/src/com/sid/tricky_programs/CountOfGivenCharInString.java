/**
 * Problem statement - Java program to get the count of given character in the string
 */
package com.sid.tricky_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class CountOfGivenCharInString {
    public static long countCharInString1(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }

    public static long countCharInString2(String str, char ch) {
        return str
                .chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        System.out.print("Enter character to search : ");
        char ch = sc.next().charAt(0);
        System.out.println("Method 1 - Count of " + ch + " is : " + countCharInString1(str, ch));
        System.out.println("Method 2 - Count of " + ch + " is : " + countCharInString2(str, ch));
    }
}