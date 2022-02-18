/**
 * 7. Reverse Integer
Medium

6598

9294

Add to List

Share
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
 */
package leetcode.company.google;

public class ReverseInteger {

    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = (reverse * 10) + x % 10;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            reverse = 0;
        }
        if (negative) {
            return (int)(reverse * -1);
        }
        return (int) reverse;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}