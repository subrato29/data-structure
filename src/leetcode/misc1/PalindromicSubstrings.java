/**
 * Created by gouthamvidyapradhan on 13/12/2017.
 *
 * <p>Given a string, your task is to count how many palindromic substrings in this string.
 *
 * <p>The substrings with different start indexes or end indexes are counted as different substrings
 * even they consist of same characters.
 *
 * <p>Example 1: Input: "abc" Output: 3 Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2: Input: "aaa" Output: 6 Explanation: Six palindromic strings: "a", "a", "a", "aa",
 * "aa", "aaa". Note: The input string length won't exceed 1000.
 *
 * <p>Solution O(n ^ 2): Example abcba: Compare char at two indices each time for example if char at
 * index 0 and index 4 are equal and if substring 1 and 3 is a palindrome then, sub-string 0 and 4
 * is also a palindrome
 */

package leetcode.misc1;

public class PalindromicSubstrings {

	public static int solution (String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}
		int len = str.length();
		int count = 0;
		
		boolean[] dp = new boolean[len];
		for (int i = 0; i < len; i++) {
			dp[i] = true;
			count++;

			char c = str.charAt(i);
			
			for (int j = 0; j < i; j++) {
				if (dp[j+1] && c == str.charAt(j)) {
					dp[j] = true;
					count++;
				} else {
					dp[j] = false;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PalindromicSubstrings().solution("aaa"));
	}

}
