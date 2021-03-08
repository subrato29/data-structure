/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/ 

package leetcode_sept;

public class Repeated_Substring_Pattern {

	public static boolean solution(String input) {
		String str = input + input;
		return str.subSequence(1, str.length() - 1).toString().contains(input);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
