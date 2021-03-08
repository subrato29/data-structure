/**
 * Given an array nums and a target value k, find the
 * maximum length of a subarray that sums to k. If there isn't one, return 0 instead.
 *
 * <p>Note: The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer
 * range.
 *
 * <p>Example 1: Given nums = [1, -1, 5, -2, 3], k = 3, return 4. (because the subarray [1, -1, 5,
 * -2] sums to 3 and is the longest)
 *
 * <p>Example 2: Given nums = [-2, -1, 2, 1], k = 1, return 2. (because the subarray [-1, 2] sums to
 * 1 and is the longest)
 *
 * <p>Follow Up: Can you do it in O(n) time?
 */
package leetcode_hashing;

import java.util.HashMap;

public class MaximumSizeSubarraySumEqualsk {

	public static int solution(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    map.put(0, -1);
	    int result = 0;
	    int sum = 0;
	 
	    for(int i=0; i<nums.length; i++){
	        sum += nums[i];
	        if(map.containsKey(sum - k)){
	            result = Math.max(result, i - map.get(sum - k));
	        }
	        map.putIfAbsent(sum, i);
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		int[] array = {1, -1, 5, -2, 3};
		int k = 3;
		System.out.println(solution(array, k));
	}

}
