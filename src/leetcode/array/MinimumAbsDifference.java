/**
 * 1200. Minimum Absolute Difference
Easy

1343

57

Add to List

Share
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 

Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]

Example 3:
Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

    public List < List < Integer >> minimumAbsDifference(int[] arr) {
        List < List < Integer >> result = new ArrayList < > ();
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int diff = (arr[i] - arr[i - 1]);
            min_diff = Math.min(min_diff, diff);
        }

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) == min_diff) {
                List < Integer > list = new ArrayList < Integer > ();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}