/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Contains Duplicate II

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
package leetcode.twopointer;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int prevIndex = 0;
        int currIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (map.keySet().contains(curr)) {
                prevIndex = map.get(curr);
                currIndex = i;
                if (currIndex - prevIndex <= k) {
                    return true;
                }
            }
            map.put (curr, i);
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
