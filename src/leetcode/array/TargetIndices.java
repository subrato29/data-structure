/**
 * 2089. Find Target Indices After Sorting Array
Easy

339

15

Add to List

Share
You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

Example 3:
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetIndices {

    public List < Integer > targetIndices(int[] nums, int target) {
        List < Integer > list = new ArrayList < Integer > ();
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                list.add(mid);
                while (mid > 0) {
                    if (nums[mid] == nums[mid - 1]) {
                        if (!list.contains(mid - 1)) {
                            list.add(mid - 1);
                        }
                        mid = mid - 1;
                    } else {
                        break;
                    }
                }
                while (mid < nums.length - 1) {
                    if (nums[mid] == nums[mid + 1]) {
                        if (!list.contains(mid + 1)) {
                            list.add(mid + 1);
                        }
                        mid = mid + 1;
                    } else {
                        break;
                    }
                }
                Collections.sort(list);
                return list;
            } else {
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}