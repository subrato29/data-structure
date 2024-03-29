/**
 * 70. Climbing Stairs
Easy

9401

290

Add to List

Share
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Time complexity: O(n)
Dynamic programming (bottom up approach)
 */

package leetcode.easy;

public class ClimbStairs_70 {

    public int climbStairs(int n) {
        int topStair = 1;
        int secondTopStair = 1;

        for(int i = 0; i < n - 1; i++) {
            int temp = topStair;
            topStair += secondTopStair;
            secondTopStair = temp;
        }

        return topStair;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}