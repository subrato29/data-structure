/**
 * 922. Sort Array By Parity II
Easy

1196

59

Add to List

Share
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:
Input: nums = [2,3]
Output: [2,3]
 */
package leetcode.array;

public class SortArrayByParityII {

	public int[] sortArrayByParityII(int[] nums) {
		int evenIdx = 0;
		int oddIdx = 1;
		int len = nums.length;

		while (evenIdx < len && oddIdx < len) {
			while (evenIdx < len && nums[evenIdx] % 2 == 0) {
				evenIdx += 2;
			}
			while (oddIdx < len && nums[oddIdx] % 2 == 1) {
				oddIdx += 2;
			}
			if (evenIdx < len && oddIdx < len) {
				int temp = nums[evenIdx];
				nums[evenIdx] = nums[oddIdx];
				nums[oddIdx] = temp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}