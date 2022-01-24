/**
 * 697. Degree of an Array
Easy

1802

1187

Add to List

Share
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: nums = [1,2,2,3,1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation: 
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 */
package leetcode.priority_queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

public class FindShortestSubArray {

    public static int findShortestSubArray(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue < Integer > maxHeap = new PriorityQueue < Integer > ((key1, key2) - > map.get(key2) - map.get(key1));
        maxHeap.addAll(map.keySet());
        int elementWithMaxFreq = maxHeap.poll();
        int maxFreq = map.get(elementWithMaxFreq);
        int minLengthSubArray = Integer.MAX_VALUE;
        int lengthOfSubArr = 0;
        ArrayList < Integer > list = new ArrayList < Integer > ();
        Iterator < Integer > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            if (maxFreq == map.get(key)) {
                list.add(key);
            }
        }
        boolean find = false;
        int i = 0;
        while (i < list.size()) {
            maxFreq = map.get(elementWithMaxFreq);
            find = false;
            lengthOfSubArr = 0;
            for (int num: nums) {
                if (num == list.get(i)) {
                    find = true;
                    maxFreq--;
                }
                if (find && maxFreq >= 0) {
                    lengthOfSubArr++;
                }
                if (maxFreq == 0) {
                    minLengthSubArray = Math.min(minLengthSubArray, lengthOfSubArr);
                    break;
                }
            }
            i++;
        }
        return minLengthSubArray;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}