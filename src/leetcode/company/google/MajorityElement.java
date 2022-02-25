/**
 * 169. Majority Element
Easy

8826

319

Add to List

Share
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
package leetcode.company.google;

import java.util.HashMap;
import java.util.Iterator;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Iterator < Integer > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            int value = map.get(key);
            if (value > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}