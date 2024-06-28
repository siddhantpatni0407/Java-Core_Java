/**
 * Problem statement - Java program to get the count of given word in the string
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class CountOfGivenWordInString {
    public static int getCountOfGivenWord(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "This is a string This is statement";
        String word = "This";
        System.out.println("Count of word " + word + " : " + getCountOfGivenWord(str, word));
    }
}