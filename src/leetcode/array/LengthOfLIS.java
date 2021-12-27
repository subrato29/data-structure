/**
 * 300. Longest Increasing Subsequence
Medium

9963

202

Add to List

Share
Given an integer array nums, return the length of the longest strictly increasing subsequence.

A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].

Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4

Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1
 */

/**
 * Pseudo code.
 * Binary Search

We can put the increasing sequence in a list.

for each num in nums
     if(list.size()==0)
          add num to list
     else if(num > last element in list)
          add num to list
     else 
          replace the element in the list which is the smallest but bigger than num
 */

package leetcode.array;

import java.util.ArrayList;

public class LengthOfLIS {

    @SuppressWarnings("null")
    public int lengthOfLIS(int[] nums) {
        if (nums == null && nums.length == 0) {
            return 0;
        }
        ArrayList < Integer > list = new ArrayList < Integer > ();
        for (int num: nums) {
            if (list.size() == 0 || list.get(list.size() - 1) < num) {
                list.add(num);
            } else {
                //binary search
                int start = 0;
                int end = list.size() - 1;
                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if (list.get(mid) < num) {
                        start = mid + 1;
                    } else {
                        end = mid;
                    }
                }
                list.set(end, num);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}