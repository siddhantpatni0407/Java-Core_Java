/**
 * Program to Identify and Classify Indian Currency.
 */

package com.sid.tricky_programs;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class IndianCurrencyIdentifier {

    // Indian currency denominations in descending order
    private static final List<Integer> DENOMINATIONS = Arrays.asList(2000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    /**
     * Method to break an amount into denominations.
     */
    public static Map<Integer, Integer> breakIntoDenominations(int amount) {
        Map<Integer, Integer> currencyCount = new LinkedHashMap<>();

        for (int denomination : DENOMINATIONS) {
            if (amount >= denomination) {
                int count = amount / denomination;
                currencyCount.put(denomination, count);
                amount %= denomination; // Update the remaining amount
            }
        }

        return currencyCount;
    }

    /**
     * Method to count the currency notes from a given list.
     */
    public static Map<Integer, Integer> countCurrencyNotes(List<Integer> notes) {
        return notes.stream()
                .filter(DENOMINATIONS::contains) // Ensure valid denominations
                .collect(Collectors.groupingBy(note -> note, Collectors.summingInt(note -> 1)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Breaking an amount into denominations
        System.out.print("Enter an amount to break into denominations: ");
        int amount = scanner.nextInt();
        Map<Integer, Integer> result = breakIntoDenominations(amount);
        System.out.println("\nDenominations for amount " + amount + ":");
        result.forEach((denomination, count) ->
                System.out.println(denomination + " x " + count)
        );

        // Example 2: Counting currency notes
        System.out.println("\nEnter a list of currency notes separated by space (e.g., 2000 500 100 100 50):");
        scanner.nextLine(); // Consume newline
        String input = scanner.nextLine();
        List<Integer> notes = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Integer, Integer> noteCount = countCurrencyNotes(notes);
        System.out.println("\nCurrency note counts:");
        noteCount.forEach((denomination, count) ->
                System.out.println(denomination + " x " + count)
        );
    }

}