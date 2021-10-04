/**
 * 215. Kth Largest Element in an Array
Medium

6973

406

Add to List

Share
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

package leetcode_array;

import java.util.ArrayList;
import java.util.Collections;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);
        return list.get(nums.length - k);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}