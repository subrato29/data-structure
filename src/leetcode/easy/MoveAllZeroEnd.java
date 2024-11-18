/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */
package leetcode.easy;

import java.util.Arrays;

public class MoveAllZeroEnd {

	public static int[] moveAllZeroEnd(int[] nums) {
		int zerothIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[zerothIndex++] = nums[i];
			}
		}

		for(int i = zerothIndex; i < nums.length; i++) {
			nums[i] = 0;
		}

		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 0, 4, 6, 0, 1, 3};
		System.out.println(Arrays.toString(moveAllZeroEnd (arr)));
	}

}
