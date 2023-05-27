/**
 * 697. Degree of an Array Easy 2.7K 1.6K Companies Given a non-empty array of non-negative integers nums, the degree of
 * this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as
 * nums.
 *
 * Example 1: Input: nums = [1,2,2,3,1] Output: 2 Explanation: The input array has a degree of 2 because both elements 1
 * and 2 appear twice. Of the subarrays that have the same degree: [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2,
 * 2], [2, 2, 3], [2, 2] The shortest length is 2. So return 2.
 *
 * Example 2: Input: nums = [1,2,2,3,1,4,2] Output: 6 Explanation: The degree is 3 because the element 2 is repeated 3
 * times. So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 */
package leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray_697 {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int degree = 0;
        int minLength = 0;
        Map<Integer, Integer> firstSeen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            firstSeen.putIfAbsent(num, i);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > degree) {
                degree = map.get(num);
                minLength = i - firstSeen.get(num) + 1;
            }
            else if (map.get(num) == degree) {
                minLength = Math.min(minLength, i - firstSeen.get(num) + 1);
            }
        }
        return minLength;
    }
}
