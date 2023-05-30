/**
 * 347. Top K Frequent Elements Medium
 *
 * 6151
 *
 * 301
 *
 * Add to List
 *
 * Share Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in
 * any order.
 *
 * Example 1: Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2]
 *
 * Example 2: Input: nums = [1], k = 1 Output: [1]
 *
 *
 * Constraints: 1 <= nums.length <= 105 k is in the range [1, the number of unique elements in the array]. It is
 * guaranteed that the answer is unique.
 */

package leetcode.priorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        int[] result = new int[k];
        int counter = 0;
        while (!maxHeap.isEmpty() && counter < k) {
            result[counter] = maxHeap.remove();
            counter++;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}