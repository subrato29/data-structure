/**
 * 2057. Smallest Index With Equal Value
Easy

99

56

Add to List

Share
Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.

x mod y denotes the remainder when x is divided by y.

Example 1:
Input: nums = [0,1,2]
Output: 0
Explanation: 
i=0: 0 mod 10 = 0 == nums[0].
i=1: 1 mod 10 = 1 == nums[1].
i=2: 2 mod 10 = 2 == nums[2].
All indices have i mod 10 == nums[i], so we return the smallest index 0.

Example 2:
Input: nums = [4,3,2,1]
Output: 2
Explanation: 
i=0: 0 mod 10 = 0 != nums[0].
i=1: 1 mod 10 = 1 != nums[1].
i=2: 2 mod 10 = 2 == nums[2].
i=3: 3 mod 10 = 3 != nums[3].
2 is the only index which has i mod 10 == nums[i].

Example 3:
Input: nums = [1,2,3,4,5,6,7,8,9,0]
Output: -1
Explanation: No index satisfies i mod 10 == nums[i].
 */
package leetcode.array;

public class SmallestEqual {

    public int smallestEqual(int[] nums) {
        int smallestIndex = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                smallestIndex = Math.min(smallestIndex, i);
            }
        }
        if (smallestIndex == Integer.MAX_VALUE) {
            return -1;
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}