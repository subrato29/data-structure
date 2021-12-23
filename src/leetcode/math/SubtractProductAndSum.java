/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
Easy

813

167

Add to List

Share
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 */

package leetcode.math;

public class SubtractProductAndSum {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}