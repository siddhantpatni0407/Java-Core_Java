/**
 * 	Problem statment - Write a program to perform various stream operations 3
 */
package com.sid.java8_features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 *
 */
public class StreamOperations3 
{
	static class Foo 
	{
        String name;
        List<Bar> bars = new ArrayList<>();

        Foo(String name) 
        {
            this.name = name;
        }
    }

    static class Bar 
    {
        String name;

        Bar(String name) 
        {
            this.name = name;
        }
    }

    public static void main(String[] args) 
    {
    	// test1();
        test2();
    }

    static void test2() 
    {
        IntStream.range(1, 4)
            .mapToObj(num -> new Foo("Foo" + num))
            .peek(f -> IntStream.range(1, 4)
                .mapToObj(num -> new Bar("Bar" + num + " <- " + f.name))
                .forEach(f.bars::add))
            .flatMap(f -> f.bars.stream())
            .forEach(b -> System.out.println(b.name));
    }

    static void test1() 
    {
        List<Foo> foos = new ArrayList<>();

        IntStream
            .range(1, 4)
            .forEach(num -> foos.add(new Foo("Foo" + num)));

        foos.forEach(f ->
            IntStream
                .range(1, 4)
                .forEach(num -> f.bars.add(new Bar("Bar" + num + " <- " + f.name))));

        foos.stream()
            .flatMap(f -> f.bars.stream())
            .forEach(b -> System.out.println(b.name));
    }
}