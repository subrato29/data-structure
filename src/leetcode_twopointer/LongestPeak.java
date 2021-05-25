/**
 * You may recall that an array arr is a mountain array if and only if:
Longest Mountain in Array

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.

Example 1:
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.

Example 2:
Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.
 */
package leetcode_twopointer;

public class LongestPeak {

	public static int longestPeak(int[] array) {
	    int longest = 0;
		int i = 1;
		while (i < array.length - 1) {
			boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
			if (!isPeak) {
				i++;
				continue;
			}
			
			int left = i - 2;
			while (left >= 0 && array[left] < array[left + 1]) {
				left--;
			}
			int right =  i + 2;
			while (right < array.length && array[right] < array[right - 1]) {
				right++;
			}
			int currentPeakLength = right - left - 1;
			if (currentPeakLength > longest) {
				longest = currentPeakLength;
			}
			i = right;
		}
		return longest;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
