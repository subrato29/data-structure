/**
 * 349. Intersection of Two Arrays
Easy

1616

1626

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
package leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intersection {

    // by Hashing
    public int[] intersection(int[] nums1, int[] nums2) {
        Set < Integer > set = new HashSet < Integer > ();
        List < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            if (set.contains(key)) {
                list.add(key);
                set.remove(key);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    //by twopointer
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set < Integer > set = new HashSet < Integer > ();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] == nums2[index2]) {
                set.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] result = new int[set.size()];
        Iterator < Integer > itr = set.iterator();
        int counter = 0;
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