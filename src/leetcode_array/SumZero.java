/**
 * 1304. Find N Unique Integers Sum up to Zero
Easy

706

366

Add to List

Share
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]
 */
package leetcode_array;

import java.util.ArrayList;

public class SumZero {

    public int[] sumZero(int n) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        for (int i = 1; i <= n / 2; i++) {
            list.add(i);
            list.add(-i);
        }
        if (n % 2 != 0) {
            list.add(0);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}