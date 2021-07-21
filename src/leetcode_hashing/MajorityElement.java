/**
 * 169. Majority Element
Easy

5513

270

Add to List

Share
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
package leetcode_hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int occurance = nums.length / 2;
        Map < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Iterator < Integer > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            int value = map.get(key);
            if (value > occurance) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}