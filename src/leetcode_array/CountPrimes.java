/**
 * 204. Count Primes
Easy

3702

869

Add to List

Share
Count the number of prime numbers less than a non-negative number, n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
 */
package leetcode_array;

public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                counter++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}