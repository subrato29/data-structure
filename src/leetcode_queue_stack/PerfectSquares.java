/*
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
	Example 1:
	
	Input: n = 12
	Output: 3 
	Explanation: 12 = 4 + 4 + 4.
	Example 2:
	
	Input: n = 13
	Output: 2
	Explanation: 13 = 4 + 9.
 */
/*Ref:
 * https://www.youtube.com/watch?v=K715avFmZIk
 */

package leetcode_queue_stack;

import java.util.Arrays;

public class PerfectSquares {
	
	public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return recur (n, dp);
    }
	
	int recur (int n, int[] dp) {
		if (dp[n] != -1) {
			return dp[n];
		}
		if (n == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i * i <= n; i++) {
			int curr = recur (n - i * i, dp) + 1;
			min = Math.min (min, curr);
		}
		return dp[n] = min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PerfectSquares().numSquares(12));
	}

}
