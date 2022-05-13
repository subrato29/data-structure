/**
 * 137. Single Number II
Medium

4080

479

Add to List

Share
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,3,2]
Output: 3

Example 2:
Input: nums = [0,1,0,1,0,1,99]
Output: 99
 */
package leetcode.medium;

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key: map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}