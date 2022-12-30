/**
 * 53. Maximum Subarray
 * Medium
 * 27.1K
 * 1.2K
 * Companies
 * Given an integer array nums, find the
 * subarray
 *  which has the largest sum and return its sum.
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 *
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 */
package leetcode.topInterviewQuestions;

public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int currentSum = 0;
        for (int num : nums) {
            currentSum = Math.max (num, currentSum + num);
            largestSum = Math.max (largestSum, currentSum);
        }
        return largestSum;
    }

}
