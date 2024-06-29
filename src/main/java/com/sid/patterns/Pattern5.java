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
public class Pattern5 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}