/**
 * 	Problem statement- Optional class demo 1
 */
package com.sid.java8_features.optional;

import java.util.Optional;

/**
 *	@author Siddhant Patni
 *
 */
public class Optional1 
{
	public static void main(String[] args) 
	{
        Optional<String> optional = Optional.of("bam");
        System.out.println(optional.isPresent());           // true
        System.out.println(optional.get());                 // "bam"
        System.out.println(optional.orElse("fallback"));    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}