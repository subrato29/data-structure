/**
 * 136. Single Number
Easy

6504

207

Add to List

Share
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 */
package leetcode.hashing;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        List < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (list.contains(value)) {
                list.remove(new Integer(value));
            } else {
                list.add(value);
            }
        }
        return list.get(0);
    }

    //time complexity: O(n)
    //Space complexity: O(1)
    public int singleNumber1(int[] nums) {
        int res = 0;
        for (int num: nums) {
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {
            2,
            2,
            1
        };
        System.out.println(singleNumber(nums));
    }

}