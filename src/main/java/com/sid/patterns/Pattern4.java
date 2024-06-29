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
public class Pattern4 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}