/**
 * 46. Permutations
Medium

8203

159

Add to List

Share
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]
 */

package leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permute {

    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> permutations = new ArrayList < List < Integer >> ();
        List < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        getPermutationsHelper(list, new ArrayList < Integer > (), permutations);
        return permutations;
    }

    public static void getPermutationsHelper(List < Integer > array,
        List < Integer > currentPermutation, List < List < Integer >> permutations) {
        if (array.size() == 0 && currentPermutation.size() > 0) {
            permutations.add(currentPermutation);
        } else {
            for (int i = 0; i < array.size(); i++) {
                List < Integer > newArray = new ArrayList < Integer > (array);
                newArray.remove(i);
                List < Integer > newPermutation = new ArrayList < Integer > (currentPermutation);
                newPermutation.add(array.get(i));
                getPermutationsHelper(newArray, newPermutation, permutations);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}