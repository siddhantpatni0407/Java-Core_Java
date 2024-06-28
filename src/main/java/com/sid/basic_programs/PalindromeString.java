package com.sid.basic_programs;

/**
 * @author Siddhant Patni
 */
public class PalindromeString {

    public static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindrome(str);

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}