/**
 * 448. Find All Numbers Disappeared in an Array
Easy

6158

366

Add to List

Share
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 */
package leetcode.company.google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {

    public List < Integer > findDisappearedNumbers(int[] nums) {
        ArrayList < Integer > missing = new ArrayList < Integer > ();
        HashSet < Integer > set = new HashSet < Integer > ();
        for (int num: nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}