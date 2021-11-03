/**
 * 1550. Three Consecutive Odds
Easy

263

41

Add to List

Share
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 
Example 1:
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.

Example 2:
Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
 */
package leetcode.array;

public class ThreeConsecutiveOdds {

	public boolean threeConsecutiveOdds(int[] arr) {
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i - 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}