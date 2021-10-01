/**
 * Problem Statement - Find length of string in java without using length method
 */

package com.sid.string_operations;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 *
 */
public class StringOperations1 {

	public static int getLength(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}
	}

	public static int getStringLength(String str) {
		String str1[] = str.split("");
		int count = 0;
		for (String s : str1) {
			count += s.toCharArray().length;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "CoreJava";

		System.out.println(str.toCharArray().length);

		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);

		System.out.println(str.split("").length);

		/*
		 * Not recommended
		 * 
		 * int l =new StringBuilder(str).length(); System.out.println(l);
		 */

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

		System.out.println(getLength(str));

		System.out.println(getLength("Sidd"));

		int l1 = 0;
		try {
			l1 = str.getBytes("UTF-16BE").length / 2;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(l1);

		System.out.println(getStringLength(str));
		System.out.println(getStringLength("Sid"));

	}

}
