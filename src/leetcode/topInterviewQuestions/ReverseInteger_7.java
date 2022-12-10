/**
 * 7. Reverse Integer
 * Medium
 * 9.2K
 * 11.2K
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
 */
package leetcode.topInterviewQuestions;

public class ReverseInteger_7 {

    public int reverse(int x) {
        int actual = x;
        if (actual < 0) {
            actual *= -1;
        }
        while (x > 0 && actual % 10 == 0) {
            actual /= 10;
        }
        long reverse = 0;
        while (actual > 0) {
            reverse = (reverse * 10) + actual % 10;
            actual /= 10;
        }
        if (reverse >= Integer.MAX_VALUE) {
            return 0;
        }
        if (x < 0) {
            reverse *= -1;
        }
        return (int)reverse;
    }

}
