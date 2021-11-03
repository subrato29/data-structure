/*
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
Input: 3
Output: [1,3,3,1]
Follow up:

Could you optimize your algorithm to use only O(k) extra space?
*/

package leetcode.aug;

import java.util.Arrays;

import java.util.List;

public class PascalsTriangleII {
	
	public static List<Integer> solution (int row) {
		Integer[] result = new Integer[row + 1];
		int prev = 0;
		
		for (int i = 1; i <= row + 1; i++) {
			for (int j = 0; j < i ; j++) {
				if (j == 0 || j == i - 1) {
					result[j] = 1;
					prev = 1;
				} else {
					int temp = result[j];
					result[j] = prev + result[j];
					prev = temp;
				}
			}
		}		
		return Arrays.asList(result);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution (4));
	}

}
