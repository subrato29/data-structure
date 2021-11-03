/**
 * 442. Find All Duplicates in an Array
Medium

3998

194

Add to List

Share
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []
*/

package leetcode.hashing;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public List < Integer > findDuplicates(int[] nums) {
        List < Integer > list = new ArrayList < > ();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                list.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}