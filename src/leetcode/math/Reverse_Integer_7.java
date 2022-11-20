package leetcode.math;

/**
 * 7. Reverse Integer
 * Medium
 * 9K
 * 11.1K
 * Companies
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 */

public class Reverse_Integer_7 {
    public int reverse(int x) {
        int actual = x;
        if (x < 0) {
            x = x * -1;
        }
        while (x > 0 && x % 10 == 0) {
            x = x / 10;
        }
        long reverse = 0;
        while (x > 0) {
            int remainder = x % 10;
            x = x / 10;
            reverse = (reverse * 10) + remainder;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        if (actual < 0) {
            reverse = reverse * -1;
        }
        return (int)reverse;
    }
}
