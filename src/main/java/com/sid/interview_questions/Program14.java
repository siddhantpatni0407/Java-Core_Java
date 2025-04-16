/**
 * Java 8 Stream Programs.
 * This class demonstrates various examples using Java 8 Stream API for different operations such as:
 * 1. Separate Odd and Even Numbers
 * 2. Remove duplicate elements from a list
 * 3. Frequency count of characters in a string
 * 4. Frequency of elements in an array
 * 5. Sort list in reverse order
 * 6. Join List of Strings with prefix, suffix, and delimiter
 * 7. Print multiples of 5 from a list
 * 8. Find maximum and minimum values in a list
 * 9. Merge two unsorted arrays into a single sorted array
 * 10. Check if two strings are anagrams
 * 11. Merge two unsorted arrays into a single sorted array without duplicates
 * 12. Sum of digits of a number
 * 13. Find three max and min numbers from a list
 * 14. Find second largest number in an integer array
 * 15. Sort list of strings in increasing order of their length
 * 16. Find common elements between two arrays
 * 17. Sum and average of all elements in an array
 * 18. Reverse each word in a string
 * 19. Reverse an integer array
 * 20. Find the sum of the first 10 natural numbers
 * 21. Check if a string is palindrome
 * 22. Find strings which start with a number
 * 23. Find last element in an array
 * 24. Find duplicate elements from an array
 * 25. Calculate the age of a person
 * 26. Generate Fibonacci series using Java 8 Stream API
 */

package com.sid.interview_questions;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program14 {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("1. Separate Odd and Even Numbers:");
        List<Integer> numberList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);

        Map<Boolean, List<Integer>> partitioned = numberList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Get and print Even numbers (true means even)
        List<Integer> evenNumbers = partitioned.get(true);
        System.out.println("Even Numbers: " + evenNumbers);

        // Get and print Odd numbers (false means odd)
        List<Integer> oddNumbers = partitioned.get(false);
        System.out.println("Odd Numbers: " + oddNumbers);

        System.out.println("----------------------------------------------------------");
        System.out.println("2. Remove duplicate element from list:");

        List<Integer> duplicateElementList = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9);

        System.out.println("duplicateElementList: " + duplicateElementList);
        List<Integer> distinctElementList = duplicateElementList.stream()
                .distinct()
                .toList();

        System.out.println("distinctElementList: " + distinctElementList);
        System.out.println("----------------------------------------------------------");
        System.out.println("3. Frequency of each character in string:");

        String inputString = "This is Java development";

        // Remove spaces if not needed for frequency count
        String cleanedString = inputString.replaceAll("\\s+", "");

        Map<Character, Long> frequencyMap1 = cleanedString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print result
        frequencyMap1.forEach((ch, count) ->
                System.out.println("Character '" + ch + " -> " + count + " times"));
        System.out.println("----------------------------------------------------------");
        System.out.println("4. Frequency of each element in the array:");

        List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5);

        Map<Integer, Long> frequencyMap2 = numbers1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print result
        frequencyMap2.forEach((num, count) ->
                System.out.println("Element " + num + " -> " + count + " times"));
        System.out.println("----------------------------------------------------------");
        System.out.println("5. Sort the list in reverse order:");

        List<Integer> listToBeSorted = Arrays.asList(5, 3, 8, 1, 4, 9, 2);
        System.out.println("listToBeSorted: " + listToBeSorted);
        // Sort in reverse order using Stream
        List<Integer> sortedDescending = listToBeSorted.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted in reverse order: " + sortedDescending);
        System.out.println("----------------------------------------------------------");
        System.out.println("6. Join List of Strings with Prefix, Suffix, and Delimiter:");

        List<String> items = Arrays.asList("Java", "Spring", "Hibernate", "Docker");

        System.out.println("input list items: " + items);

        String joinedString = items.stream().collect(Collectors.joining("Delimiter", "Prefix", "Suffix"));

        System.out.println("joined String: " + joinedString);

        String result = items.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Joined String: " + result);

        System.out.println("----------------------------------------------------------");
        System.out.println("7. Print multiple of 5 from the list:");

        List<Integer> numbers2 = Arrays.asList(10, 12, 15, 17, 20, 23, 25, 30, 33);
        System.out.println("Input list: " + numbers2);

        List<Integer> multiplesOfFive = numbers2.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        System.out.println("Multiples of 5: " + multiplesOfFive);
        System.out.println("----------------------------------------------------------");
        System.out.println("8. Find Maximum and Minimum values in list:");

        List<Integer> numbers3 = Arrays.asList(10, 25, 5, 40, 30, 15);
        System.out.println("Input list: " + numbers3);

        Optional<Integer> max1 = numbers3.stream().max(Integer::compareTo);
        Optional<Integer> min1 = numbers3.stream().min(Integer::compareTo);
        //or
        Integer max2 = numbers3.stream().max(Comparator.naturalOrder()).get();
        Integer min2 = numbers3.stream().min(Comparator.naturalOrder()).get();

        max1.ifPresent(m -> System.out.println("Maximum: " + m));
        min1.ifPresent(m -> System.out.println("Minimum: " + m));
        System.out.println("Maximum: " + max2);
        System.out.println("Minimum: " + min2);
        System.out.println("----------------------------------------------------------");
        System.out.println("9. Merge two Unsorted array into single sorted array:");

        Integer[] arr1 = {10, 5, 20, 15};
        Integer[] arr2 = {25, 3, 8, 12};
        System.out.println("arr1: " + Arrays.stream(arr1).toList());
        System.out.println("arr2: " + Arrays.stream(arr2).toList());

        // Merge and sort arrays
        List<Integer> sortedMergedList = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toList();

        System.out.println("Sorted Merged List: " + sortedMergedList);
        System.out.println("----------------------------------------------------------");
        System.out.println("10. Anagram using java 8:");

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = Stream.of(str1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        str2 = Stream.of(str2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are Anagram");
        } else {
            System.out.println("str1 and str2 are not Anagram");
        }

        /*
        // other approach using Map
        // Convert to frequency map using Java 8 Streams
        Map<Character, Long> freqMap1 = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> freqMap2 = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
         */

        System.out.println("----------------------------------------------------------");
        System.out.println("11. Merge Two Unsorted Arrays Into Single Sorted Array  Without Duplicates:");

        Integer[] arr3 = {10, 5, 20, 15, 10};
        Integer[] arr4 = {25, 3, 8, 15, 20};

        List<Integer> mergedSortedUniqueList = Stream.concat(Arrays.stream(arr3), Arrays.stream(arr4))
                .distinct()                            // remove duplicates
                .sorted()                              // sort in ascending order
                .toList();

        System.out.println("Merged Sorted Unique List: " + mergedSortedUniqueList);

        System.out.println("----------------------------------------------------------");
        System.out.println("12. Sum of digits of a number:");

        int number = 12345;

        System.out.println("number : " + number);

        int sum1 = Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        int sum2 = String.valueOf(number)
                .chars()                               // IntStream of Unicode values
                .map(c -> c - '0')                 // Convert char to digit
                .sum();                                // Sum of digits

        System.out.println("Sum of digits: " + sum1);
        System.out.println("Sum of digits: " + sum2);

        System.out.println("----------------------------------------------------------");
        System.out.println("13. Find Three Max and Min number from List:");

        List<Integer> numbers = Arrays.asList(15, 3, 25, 7, 30, 10, 1, 50, 18);

        // Top 3 Maximum
        List<Integer> top3Max = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        // Top 3 Minimum
        List<Integer> top3Min = numbers.stream()
                .sorted()
                .limit(3)
                .toList();

        System.out.println("Top 3 Maximum: " + top3Max);
        System.out.println("Top 3 Minimum: " + top3Min);

        System.out.println("----------------------------------------------------------");
        System.out.println("14. Find Second largest number in integer array:");

        int[] arr = {10, 20, 30, 40, 50, 30, 50};

        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct()                                // Remove duplicates
                .boxed()
                .sorted(Comparator.reverseOrder())         // Sort descending
                .mapToInt(Integer::intValue)
                .skip(1)                                    // Skip the largest
                .findFirst();                               // Get the second largest

        if (secondLargest.isPresent()) {
            System.out.println("Second Largest: " + secondLargest.getAsInt());
        } else {
            System.out.println("Array doesn't have enough distinct elements.");
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("15. Sort List Strings in increasing order of their length:");


        List<String> names = Arrays.asList("Java", "SpringBoot", "AI", "Microservices", "K8s");

        List<String> sortedByLength = names.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println("Sorted by length (ascending): " + sortedByLength);

        System.out.println("----------------------------------------------------------");
        System.out.println("16. Find Common Elements Between Two Arrays:");

        Integer[] arr5 = {1, 2, 3, 4, 5, 6};
        Integer[] arr6 = {4, 5, 6, 7, 8, 9};

        // Convert second array to a Set for fast lookup
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr6));

        // Stream the first array and filter elements present in set2
        List<Integer> commonElements = Arrays.stream(arr5)
                .filter(set2::contains)
                .distinct() // optional: removes duplicates
                .toList();

        System.out.println("Common Elements: " + commonElements);

        System.out.println("----------------------------------------------------------");
        System.out.println("17. Sum and average of all elements of Array:");

        int[] numbers4 = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(numbers4).sum();

        double average = Arrays.stream(numbers4).average()
                .orElse(0); // In case array is empty

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        System.out.println("----------------------------------------------------------");
        System.out.println("18. Reverse each word of String:");

        String input = "Java Stream API is powerful";

        System.out.println("input String: " + input);

        String reversedWords = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("Reversed Each Word: " + reversedWords);
        System.out.println("----------------------------------------------------------");
        System.out.println("19. Reverse an integer array:");

        int[] arr7 = {10, 20, 30, 40, 50};

        int[] reversed = IntStream.rangeClosed(1, arr7.length)
                .map(i -> arr7[arr7.length - i])
                .toArray();

        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");
        System.out.println("20. Sum of first 10 natural numbers:");

        int sum3 = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum of first 10 natural numbers: " + sum3);

        System.out.println("----------------------------------------------------------");
        System.out.println("21. Palindrome using java 8:");

        String input1 = "madam";

        boolean isPalindrome = IntStream.range(0, input1.length() / 2)
                .allMatch(i -> input1.charAt(i) == input1.charAt(input1.length() - i - 1));

        System.out.println("Is \"" + input1 + "\" a palindrome? " + isPalindrome);
        System.out.println("----------------------------------------------------------");
        System.out.println("22. Find strings which starts with number:");

        List<String> input2 = Arrays.asList("1abc", "hello", "123start", "Test", "9Lives", "abc123");

        List<String> result1 = input2.stream()
                .filter(s -> s.matches("^[0-9].*"))
                .toList();

        //or
        Set<String> result2 = input2.stream()
                .filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
                .collect(Collectors.toSet());

        System.out.println("Strings starting with a number: " + result1);
        System.out.println("Strings starting with a number: " + result2);
        System.out.println("----------------------------------------------------------");
        System.out.println("23. Find last element of Array:");

        List<String> input3 = Arrays.asList("Java", "Spring", "Docker");
        System.out.println("input : " + input3);
        String lastElement = input3.stream()
                .skip(input3.size() - 1)
                .findFirst()
                .orElse(null); // safer than get()

        System.out.println("Last Element: " + lastElement);
        System.out.println("----------------------------------------------------------");
        System.out.println("24. Find duplicate elements from Array:");

        String[] arr8 = {"Java", "Spring", "Docker", "Java", "Kubernetes", "Docker"};

        Set<String> seen = new HashSet<>();

        Set<String> duplicates = Arrays.stream(arr8)
                .filter(e -> !seen.add(e)) // `add` returns false if element already exists
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
        System.out.println("----------------------------------------------------------");
        System.out.println("25. Age of Person in Year:");

        LocalDate birthDate = LocalDate.of(1995, 4, 16);  // Replace with actual DOB
        LocalDate today = LocalDate.now();

        int age = Period.between(birthDate, today).getYears();

        System.out.println("Age: " + age + " years");


        System.out.println("----------------------------------------------------------");
        System.out.println("26. Fibonacci series using java 8:");

        int n = 10;
        // Generate Fibonacci series using Stream
        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i + " "));
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");

    }

}