/**
 * Given a non-empty string check if it can be
 * constructed by taking a substring of it and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will
 * not exceed 10000.
 *
 * <p>Example 1: Input: "abab"
 *
 * <p>Output: True
 *
 * <p>Explanation: It's the substring "ab" twice. Example 2: Input: "aba"
 *
 * <p>Output: False Example 3: Input: "abcabcabcabc"
 *
 * <p>Output: True
 *
 * <p>Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
package leetcode_string;

public class RepeatedSubstringPattern {
	
	public static boolean solution (String string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			sb.append(String.valueOf(string.charAt(i)));
			if (sb.length() > 1) {
				String complement = string.substring(i + 1, string.length());
				if (complement.contains(sb)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcabcabcabc"));
	}

}
