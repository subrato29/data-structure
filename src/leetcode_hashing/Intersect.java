/**
 * 350. Intersection of Two Arrays II
Easy

2395

534

Add to List

Share
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
package leetcode_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                if (value == 0) {
                    map.remove(key);
                } else {
                    list.add(key);
                    map.put(key, value - 1);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {
            4,
            9,
            5
        };
        int[] nums2 = {
            9,
            4,
            9,
            8,
            4
        };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

}