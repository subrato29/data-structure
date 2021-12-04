/**
 * Created by gouthamvidyapradhan on 07/07/2017. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest sum.
 *
 * <p>For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has
 * the largest sum = 6.
 */

package leetcode.misc1;

public class MaximumSubarray {

	public static int solution(int[] nums) {
		int sum = nums[0];
		int result = nums[0];
		
		for (int i = 0; i<nums.length; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			result = Math.max(sum, result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(solution (arr));
	}

}
