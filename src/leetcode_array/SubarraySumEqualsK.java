/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
	
	Example 1:
	Input: nums = [1,1,1], k = 2
	Output: 2
	
	Example 2:
	Input: nums = [1,2,3], k = 3
	Output: 2
 */
package leetcode_array;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] nums, int k) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int n = map.getOrDefault(sum - k, 0);
            count += n;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {
            1,
            2,
            3,
            4
        };
        System.out.println(subarraySumEqualsK(nums, 3));
    }

}