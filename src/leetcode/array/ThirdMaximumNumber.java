/**
 * Created by gouthamvidyapradhan on 25/03/2017. Given a non-empty array of integers, return the
 * third maximum number in this array. If it does not exist, return the maximum number. The time
 * complexity must be in O(n).
 *
 * <p>Example 1: Input: [3, 2, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: The third maximum is 1. Example 2: Input: [1, 2]
 *
 * <p>Output: 2
 *
 * <p>Explanation: The third maximum does not exist, so the maximum (2) is returned instead. Example
 * 3: Input: [2, 2, 3, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: Note that the third maximum here means the third maximum distinct number. Both
 * numbers with value 2 are both considered as second maximum.
 */
package leetcode.array;

import java.util.Arrays;
import java.util.TreeSet;

public class ThirdMaximumNumber {

	public static int thirdMax(int[] nums) {
		int index = 0;
		long[] result = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > result[0]) {
				result[2] = result[1];
				result[1] = result[0];
				result[0] = nums[i];
				index++;
			} else if (nums[i] > result[1] && nums[i] < result[0]) {
				result[2] = result[1];
				result[1] = nums[i];
				index++;
			} else if (nums[i] > result[2] && nums[i] < result[1]) {
				result[2] = nums[i];
				index++;
			}
		}
		return index > 2 ? (int) result[2] : (int) result[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 1 };
		System.out.println(thirdMax(arr));
	}

}