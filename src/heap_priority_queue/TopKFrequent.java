/**
 * 347. Top K Frequent Elements
Medium

6151

301

Add to List

Share
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
 

Constraints:
1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
*/

package heap_priority_queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || nums == null) {
            return new int[] {};
        }
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue < Integer > maxHeap = new PriorityQueue < Integer > ((key1, key2) -> map.get(key2) - map.get(key1));
        maxHeap.addAll(map.keySet());

        ArrayList < Integer > list = new ArrayList < Integer > ();
        System.out.println(map.get(maxHeap.peek()));
        while (map.size() != 0 && maxHeap.size() != 0 && list.size() < k) {
            list.add(maxHeap.poll());
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}