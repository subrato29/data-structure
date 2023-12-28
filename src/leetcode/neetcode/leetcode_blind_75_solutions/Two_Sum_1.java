/**
 * 1. Two Sum
 * Easy
 * 54K
 * 1.8K
 * Companies
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

package leetcode.neetcode.leetcode_blind_75_solutions;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(map.containsKey(remainder)) {
                return new int[] {map.get(remainder), i};
            }
            map.putIfAbsent(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
