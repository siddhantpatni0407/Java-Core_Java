/**
 * Problem statement - Java implementation to check if N can be written as sum of k primes
 */

package com.sid.hackerrank;

/**
 * @author Siddhant Patni
 *
 */
public class SumOfKPrimeNumbers {
    // Checking if a number is prime or not
    static boolean isprime(int x) {
        // check for numbers from 2 to sqrt(x)
        // if it is divisible return false
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0)
                return false;
        return true;
    }

    // Returns true if N can be written as sum
    // of K primes
    static boolean isSumOfKprimes(int N, int K) {
        // N < 2K directly return false
        if (N < 2 * K)
            return false;

        // If K = 1 return value depends on primality of N
        if (K == 1)
            return isprime(N);

        if (K == 2) {
            // if N is even directly return true;
            if (N % 2 == 0)
                return true;

            // If N is odd, then one prime must
            // be 2. All other primes are odd
            // and cannot have a pair sum as even.
            return isprime(N - 2);
        }

        // If K >= 3 return true;
        return true;
    }

    public static void main(String[] args) {
        int n = 10, k = 2;
        if (isSumOfKprimes(n, k))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}