/**
 * 78. Subsets
Medium

7704

128

Add to List

Share
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
package leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	//Time: O(n * 2 ^ n)
	//Space: O(n * 2 ^ n)
    //Iterative approach
    public List < List < Integer >> subsets(int[] nums) {
        List < List < Integer >> result = new ArrayList < List < Integer >> ();
        result.add(new ArrayList < Integer > ());
        for (int i = 0; i < nums.length; i++) {
            int length = result.size();
            for (int j = 0; j < length; j++) {
                List < Integer > currentSubset = new ArrayList < Integer > (result.get(j));
                currentSubset.add(nums[i]);
                result.add(currentSubset);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}