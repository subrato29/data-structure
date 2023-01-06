/**
 * 69. Sqrt(x)
 * Easy
 * 5.6K
 * 3.8K
 * Companies
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
package leetcode.topInterviewQuestions;

public class Sqrt_x_69 {

    public int mySqrt(int x) {
        if (x == 1) {
            return x;
        }
        long start = 0;
        long end = x / 2;
        while (start <= end) {
            long mid = (start + end) / 2;
            long square = mid * mid;
            if (square == x) {
                return (int)mid;
            } else if (square > x) {
                end = mid - 1;
            } else if (square < x) {
                start = mid + 1;
            }
        }
        return (int)start - 1;
    }

}
