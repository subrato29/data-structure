/**
 * 1979. Find Greatest Common Divisor of Array
Easy

271

14

Add to List

Share
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

Example 3:
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
 */
package leetcode.array;

import java.util.Arrays;

public class FindGCD {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        int greatestDivisor = Integer.MIN_VALUE;

        for (int i = 1; i <= largest; i++) {
            if (smallest % i == 0 && largest % i == 0) {
                greatestDivisor = Math.max(greatestDivisor, i);
            }
        }
        return greatestDivisor;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}