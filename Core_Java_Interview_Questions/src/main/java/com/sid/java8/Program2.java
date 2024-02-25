package com.sid.java8;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program2 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(9, 5, 4, 1, 2, 7, 3, 10, 6, 8, 10); // Your list of numbers
        List<String> stringList = Arrays.asList("siddhant", "priyanka", "siya", "madam");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 1);

        System.out.println("numberList -> " + numberList);
        System.out.println("stringList -> " + stringList);
        System.out.println("list1 -> " + list1);
        System.out.println("list2 -> " + list2);

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

        //26. Find the sum of all integers in a list.
        int sumOfAllNumbers = numberList
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumOfAllNumbers -> " + sumOfAllNumbers);

        //27. Find the maximum number in a list.
        Optional<Integer> maxNum = numberList
                .stream()
                .max(Integer::compareTo);
        System.out.println("maxNum -> " + maxNum);

        //28. Extract digits from a list of integers and concatenate them into a single number.
        String concatenatedDigits = numbersList
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        int concatenatedNumber = Integer.parseInt(concatenatedDigits);
        System.out.println("concatenatedNumber -> " + concatenatedNumber);

        //29. Calculate the factorial of each number in a list.
        List<Long> factorials = numberList
                .stream()
                .map(n -> IntStream.rangeClosed(1, n)
                        .mapToLong(Long::valueOf)
                        .reduce(1L, (a, b) -> a * b))
                .collect(Collectors.toList());
        System.out.println("factorials -> " + factorials);

        //30. Check if a list contains a palindrome string.
        boolean containsPalindrome = stringList
                .stream()
                .anyMatch(s -> new StringBuilder(s)
                        .reverse()
                        .toString()
                        .equals(s));
        System.out.println("containsPalindrome -> " + containsPalindrome);

        //31. Remove vowels from strings in a list.
        List<String> withoutVowels = stringList
                .stream()
                .map(s -> s.replaceAll("[aeiouAEIOU]", ""))
                .collect(Collectors.toList());
        System.out.println("withoutVowels -> " + withoutVowels);

        //32. Find the intersection of two lists.
        List<Integer> intersection = list1
                .stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println("intersection -> " + intersection);

        //33. Find the union of two lists.
        List<Integer> union = Stream
                .concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("union -> " + union);

        //34. Remove elements from one list that are present in another list.
        List<Integer> removedElements = list1
                .stream()
                .filter(e -> !list2.contains(e))
                .collect(Collectors.toList());
        System.out.println("removedElements -> " + removedElements);

        //35. Replace all occurrences of a specific element in a list with another element.
        List<Integer> replacedList = numberList
                .stream()
                .map(n -> n == 4 ? 1 : n)
                .collect(Collectors.toList());
        System.out.println("replacedList -> " + replacedList);

        //36. Shuffle the elements of a list.
        List<Integer> shuffledList = new ArrayList<>(numberList);
        Collections.shuffle(shuffledList);
        System.out.println("shuffledList -> " + shuffledList);

        //37. Rotate the elements of a list by a given distance.
        Collections.rotate(numberList, 1);
        System.out.println("numberList -> " + numberList);

        //38. Reverse the order of elements in a list.
        Collections.reverse(numberList);
        System.out.println("reverseList -> " + numberList);

        //39. Find the frequency of each element in a list.
        Map<Integer, Long> frequencyMap = numberList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("frequencyMap -> " + frequencyMap);

        //40. Find the first non-repeating element in a list.
        Optional<Integer> firstNonRepeating = numberList
                .stream()
                .filter(n -> Collections.frequency(numberList, n) == 1)
                .findFirst();
        System.out.println("firstNonRepeating -> " + firstNonRepeating);

        //41. Find the kth smallest element in a list.
        int k = 3;
        Optional<Integer> kthSmallest = numbersList
                .stream()
                .sorted()
                .skip(k - 1)
                .findFirst();
        System.out.println("kthSmallest -> " + kthSmallest);

        //42. Check if a list is sorted in ascending order.
        boolean isSorted = IntStream
                .range(0, numberList.size() - 1)
                .allMatch(i -> numberList.get(i) <= numberList.get(i + 1));

        System.out.println("isSorted -> " + isSorted);

        //43. Find the mode (most frequently occurring element) in a list.
        Map<Integer, Long> frequencyMap1 = numberList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> modeEntry = frequencyMap1
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        Integer mode = modeEntry
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("mode -> " + mode);

        //44. Find the difference between the maximum and minimum numbers in a list.
        OptionalInt maxNumber1 = numberList
                .stream()
                .mapToInt(Integer::intValue)
                .max();
        OptionalInt minNumber1 = numberList
                .stream()
                .mapToInt(Integer::intValue)
                .min();
        int difference = max.orElse(0) - min.orElse(0);
        System.out.println("difference -> " + difference);

        //45. Check if a list is a palindrome.
        boolean isPalindrome = IntStream
                .range(0, numberList.size() / 2)
                .allMatch(i -> numberList.get(i).equals(numberList.get(numberList.size() - i - 1)));
        System.out.println("isPalindrome -> " + isPalindrome);

        //46. Find the median of a list of numbers.
        List<Integer> sortedNumbers1 = numberList
                .stream()
                .sorted()
                .collect(Collectors.toList());
        double median;
        int size = sortedNumbers1.size();
        if (size % 2 == 0) {
            median = (sortedNumbers1.get(size / 2 - 1) + sortedNumbers1.get(size / 2)) / 2.0;
        } else {
            median = sortedNumbers1.get(size / 2);
        }
        System.out.println("median -> " + median);

        //47. Calculate the sum of squares of all numbers in a list.
        int sumOfSquares = numberList
                .stream()
                .mapToInt(n -> n * n).sum();
        System.out.println("sumOfSquares -> " + sumOfSquares);

        //48. Find the Cartesian product of two lists.
        List<List<Integer>> cartesianProduct = list1
                .stream()
                .flatMap(e1 -> list2.stream()
                        .map(e2 -> Arrays.asList(e1, e2)))
                .collect(Collectors.toList());
        System.out.println("cartesianProduct -> " + cartesianProduct);

        //49. Find the average of squares of all even numbers in a list.
        OptionalDouble averageOfSquaresOfEven = numberList
                .stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> n * n)
                .average();
        System.out.println("averageOfSquaresOfEven -> " + averageOfSquaresOfEven);

        //50. Find the cumulative sum of elements in a list.
        AtomicInteger sum1 = new AtomicInteger(0);
        List<Integer> cumulativeSum = numberList
                .stream()
                .map(sum1::addAndGet)
                .collect(Collectors.toList());
        System.out.println("cumulativeSum -> " + cumulativeSum);
    }

}