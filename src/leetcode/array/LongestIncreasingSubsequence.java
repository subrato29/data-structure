/**
 * Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.

A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

Example 1:

Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
Example 2:

Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.
 * 
 */
package leetcode.array;

public class LongestIncreasingSubsequence {

	public static int longestIncreasingContinuousSubsequence(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int pointer = 1;
		int maxLength = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i - 1]) {
				pointer++;
			} else {
				pointer = 1;
			}
			maxLength = Math.max(maxLength, pointer);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// int[] nums = {1, 3, 5, 4, 7, 2, 4, 5, 8, 9, 1, 10, 12};
		// int[] nums = {1, 3, 5, 4, 7};
		// int[] nums = {2, 2, 2, 2, 2};
		// int[] nums = {1, 3, 5, 7};
		// int[] nums = {1, 3, 5, 4, 2, 3, 4};
		int[] nums = { 1, 3, 5, 4, 2, 3, 4, 5 };
		System.out.println(longestIncreasingContinuousSubsequence(nums));
	}

}