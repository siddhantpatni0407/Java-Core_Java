/**
 * Problem Statement - Print from 1 to 100 without using any numbers in your code
 * Output numbers from 1..100 without using any number
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant
 *
 */
public class PrintOneToHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int one = 'A' / 'A';
		String s1 = "..........";

		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
		
		System.out.println("************* Sepearate two output *************");
		
		//a-97, b=98, c=99, d=100 (ASCII value)
		for (int i = one; i <= 'd'; i += one) {
			System.out.println(i);

		}
	}

}
