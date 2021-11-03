/**
 * 231. Power of Two
Easy

1736

236

Add to List

Share
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false

Example 4:
Input: n = 4
Output: true

Example 5:
Input: n = 5
Output: false
 */
package leetcode.math;

public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i = i * 2;
        }
        return i == n;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}