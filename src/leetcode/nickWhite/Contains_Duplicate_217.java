/**
 * 217. Contains Duplicate
Easy

3805

926

Add to List

Share
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
package src.leetcode.nickWhite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        Set < Integer > set = new HashSet < Integer > ();
        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}