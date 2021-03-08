/**
 * Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 */

//timecomplexity: O(logn)
//spacecomplexity: O(1)

package search;

public class SqrtX {
	
	public static int sqrtX(int num) {
		if (num == 1) {
			return 1;
		}
		long start = 0;
		long end = num / 2;
		while (start <= end) {
			long mid = (start + end) / 2;
			if (mid * mid == num) {
				return (int)mid;
			} else if (mid * mid < num) {
				start = mid + 1;
			} else if (mid * mid > num) {
				end = mid - 1;
			}
		}
		return (int)(start - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(sqrtX(8));
	}

}
