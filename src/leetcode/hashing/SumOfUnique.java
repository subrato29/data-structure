/**
 * 1748. Sum of Unique Elements

 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Example 2:
Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

Example 3:
Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 */
package leetcode.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SumOfUnique {

    public int sumOfUnique(int[] nums) {
        Map < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int runningSum = 0;
        Iterator < Integer > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int curr = itr.next();
            if (map.get(curr) == 1) {
                runningSum += curr;
            }
        }
        return runningSum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}