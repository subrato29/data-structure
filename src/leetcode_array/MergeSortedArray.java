/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

package leetcode_array;

import java.util.Arrays;

public class MergeSortedArray {
	
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int[] result = new int[m + n];
		int count = 0;
        for (int i = 0; i < m; i++) {
        	result[count] = nums1[i];
        	count++;
        }
        for (int i = 0; i < n; i++) {
        	result[count] = nums2[i];
        	count++;
        }
        Arrays.sort(result);
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		System.out.println(Arrays.toString(new MergeSortedArray().merge(nums1, 3, nums2, 3)));
	}

}
