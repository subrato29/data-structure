/**
 * 1985. Find the Kth Largest Integer in the Array
Medium

181

30

Add to List

Share
You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.

Return the string that represents the kth largest integer in nums.

Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.

Example 1:
Input: nums = ["3","6","7","10"], k = 4
Output: "3"
Explanation:
The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
The 4th largest integer in nums is "3".

Example 2:
Input: nums = ["2","21","12","1"], k = 3
Output: "2"
Explanation:
The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
The 3rd largest integer in nums is "2".

Example 3:
Input: nums = ["0","0"], k = 2
Output: "0"
Explanation:
The numbers in nums sorted in non-decreasing order are ["0","0"].
The 2nd largest integer in nums is "0".
 */

package leetcode.priorityQueue;

import java.util.PriorityQueue;

public class KthLargestNumber {

    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue < String > maxHeap = new PriorityQueue < > ((a, b) -> a.length() == b.length() ? b.compareTo(a) : b.length() - a.length());
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        String result = "";
        int counter = 0;
        while (!maxHeap.isEmpty() && counter < k) {
            result = maxHeap.remove();
            counter++;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}