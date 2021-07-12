/**
 * 905. Sort Array By Parity
Easy

1890

99

Add to List

Share
Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.

You may return any answer array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
package leetcode_twopointer;

public class SortArrayByParity {

	public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] % 2 == 0) {
                start++;
            } else {
                if (nums[end] % 2 == 0) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;   
                }
                end--;
            }
        }
        return nums;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
