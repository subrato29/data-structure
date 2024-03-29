/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
package leetcode.array;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotate(int[] nums, int k) {
		if (nums.length == 0) {
			return new int[] { -1 };
		}
		if (nums.length == 1) {
			return nums;
		}

		int counter = 0;
		while (counter < k) {
			helperRotate(nums);
			counter++;
		}
		return nums;
	}

	public static void helperRotate(int[] nums) {
		int length = nums.length;
		int lastElement = nums[nums.length - 1];
		for (int i = length - 1; i >= 1; i--) {
			nums[i] = nums[i - 1];
		}
		nums[0] = lastElement;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		System.out.println(Arrays.toString(rotate(nums, k)));
	}

}