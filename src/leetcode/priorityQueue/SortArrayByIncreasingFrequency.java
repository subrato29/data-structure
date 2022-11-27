/**
 * 1636. Sort Array by Increasing Frequency
Easy

1058

43

Add to List

Share
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

Example 1:
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2:
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3:
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 */
package leetcode.priorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue < Integer > pq = new PriorityQueue < Integer > ((key1, key2) -> map.get(key1) == map.get(key2) ? key2 - key1 : map.get(key1) - map.get(key2));
        pq.addAll(map.keySet());
        ArrayList < Integer > list = new ArrayList < Integer > ();
        while (pq.size() > 0) {
            int key = pq.poll();
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                list.add(key);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}