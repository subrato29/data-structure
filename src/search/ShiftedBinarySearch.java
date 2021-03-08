/**
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 */
package search;

public class ShiftedBinarySearch {
	
	public static int shiftedBinarySearch(int[] array, int target) {
	  return helper(array, target, 0, array.length - 1);
	}
		
	public static int helper(int[] array, int target, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			int potentialMatch = array[mid];
			int leftNum = array[left];
			int rightNum = array[right];
			if (target == potentialMatch) {
				return mid;
			} else if (leftNum <= potentialMatch) {
				if (target >= leftNum && target < potentialMatch) {
					right = mid - 1; 
				} else {
					left = mid + 1;
				}
			} else {
				if (target >= potentialMatch && target < rightNum) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
