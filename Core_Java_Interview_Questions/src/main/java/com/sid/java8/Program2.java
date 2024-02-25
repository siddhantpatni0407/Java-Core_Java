package com.sid.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Program2 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(9, 5, 4, 1, 2, 7, 3, 10, 6, 8); // Your list of numbers
        List<String> stringList = Arrays.asList("siddhant", "priyanka", "siya");

        System.out.println("numberList -> " + numberList);
        System.out.println("stringList -> " + stringList);

        // 1. Sum of even numbers
        int sumOfEvenNumbers = numberList
                .stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumOfEvenNumbers -> " + sumOfEvenNumbers);

        // 2. Sum of odd numbers
        int sumOfOddNumbers = numberList
                .stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumOfOddNumbers -> " + sumOfOddNumbers);

        // 3. Number of even integers
        long count = numberList
                .stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Number of even integers -> " + count);

        //4. Sum of numbers
        int sum = numberList
                .stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers -> " + sum);

        //5. Max or Min using Optional
        Optional<Integer> max = numberList
                .stream()
                .max(Integer::compareTo);

        Optional<Integer> min = numberList
                .stream()
                .min(Integer::compareTo);
        System.out.println("Max -> " + max.orElse(null) + ", Min -> " + min.orElse(null));

        //6. Distinct numbers
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
        List<Integer> distinctNumbers = numbersList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers -> " + distinctNumbers);

        //7. use skip and limit
        List<Integer> result = numberList
                .stream()
                .skip(3)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Result -> " + result);

        //8. Find average : Given a list of integers, find the average of all elements.
        double average = numberList
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average -> " + average);

        //9. Squared doubles : Given a list of doubles, square each element and collect the results in a new list.
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> squaredDoubles = doubles
                .stream()
                .map(d -> d * d)
                .collect(Collectors.toList());
        System.out.println("Squared doubles -> " + squaredDoubles);

        //10. Combining two lists : Given two lists of integers, create a new list containing all possible combinations of pairs of integers from the two lists
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
        List<List<Integer>> combinations = list1
                .stream()
                .flatMap(i -> list2.stream().map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());
        System.out.println("Combinations -> " + combinations);

        //11. Find the maximum number in a list using Optional
        Optional<Integer> maxNumber = numberList
                .stream()
                .max(Integer::compareTo);
        System.out.println("maxNumber -> " + maxNumber);

        //12. Find the minimum number in a list using Optional
        Optional<Integer> minNumber = numberList
                .stream()
                .min(Integer::compareTo);
        System.out.println("minNumber -> " + minNumber);

        //13. Check if all elements in a list are even.
        boolean allEven = numberList
                .stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("allEven -> " + allEven);

        //14. Check if any element in a list is negative.
        boolean anyNegative = numberList
                .stream()
                .anyMatch(n -> n < 0);
        System.out.println("anyNegative -> " + anyNegative);

        //15. Convert a list of strings to uppercase.
        List<String> upperCaseStrings = stringList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upperCaseStrings -> " + upperCaseStrings);

        //16. Concatenate all strings in a list into a single string.
        String concatenatedString = stringList
                .stream()
                .collect(Collectors.joining());
        System.out.println("concatenatedString -> " + concatenatedString);

        //17. Sort a list of integers in ascending order.
        List<Integer> sortedNumbers = numberList
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sortedNumbers -> " + sortedNumbers);

        //18. Find the length of the longest string in a list.
        OptionalInt maxLength = stringList
                .stream()
                .mapToInt(String::length)
                .max();
        System.out.println("maxLength -> " + maxLength);

        //19. Find the second-largest number in a list.
        Optional<Integer> secondLargest = numberList
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("secondLargest -> " + secondLargest);

        //20. Group integers in a list by their parity (even or odd).
        Map<Boolean, List<Integer>> groupedByParity = numberList
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("groupedByParity -> " + groupedByParity);

        //21. Group strings in a list by their length.
        Map<Integer, List<String>> groupedByLength = stringList
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("groupedByLength -> " + groupedByLength);

        //22. Find the number of occurrences of a specific element in a list.
        long countOccurrences = numberList
                .stream()
                .filter(n -> n == 10)
                .count();
        System.out.println("countOccurrences -> " + countOccurrences);

        //23. Multiply all elements in a list by a given factor.
        List<Integer> multipliedNumbers = numberList
                .stream()
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("multipliedNumbers -> " + multipliedNumbers);

        //24. Convert a list of integers to a list of strings.
        List<String> stringNumbers = numberList
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println("stringNumbers -> " + stringNumbers);

        //25. Remove all null elements from a list.
        List<String> nonNullStrings = stringList
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println("nonNullStrings -> " + nonNullStrings);

    }

}