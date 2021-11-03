/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */
package leetcode.array;

public class MaxSubArray {

	public int maxSubArray(int[] nums) {
		int largestSum = nums[0];
		int currSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			largestSum = Math.max(largestSum, currSum);
		}
		return largestSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}