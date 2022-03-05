/**
 * 349. Intersection of Two Arrays
Easy

2537

1857

Add to List

Share
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
package leetcode.company.lyft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet < Integer > set = new HashSet < Integer > ();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] == nums2[index2]) {
                set.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] result = new int[set.size()];
        int counter = 0;
        Iterator < Integer > itr = set.iterator();
        while (itr.hasNext()) {
            result[counter] = itr.next();
            counter++;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}