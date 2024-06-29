/**
 * Output:
 * <p>
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */

package com.sid.patterns;

/**
 * @author Siddhant Patni
 */
public class Pattern7 {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}