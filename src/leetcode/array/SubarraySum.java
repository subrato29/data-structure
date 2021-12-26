/**
 * 560. Subarray Sum Equals K
Medium

10218

335

Add to List

Share
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */

package leetcode.array;

import java.util.HashMap;

public class SubarraySum {

    @SuppressWarnings("null")
	public int subarraySum(int[] nums, int k) {
        if (nums == null && nums.length == 0) {
            return 0;
        }
        int counter = 0;
        int sum = 0;
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        map.put(0, 1);
        for (Integer num: nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                counter += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}