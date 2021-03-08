/*
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	Example 1:
	Input: haystack = "hello", needle = "ll"
	Output: 2
	Example 2:
	Input: haystack = "aaaaa", needle = "bba"
	Output: -1
	Clarification:
	What should we return when needle is an empty string? This is a great question to ask during an interview.
	For the purpose of this problem, we will return 0 when needle is an empty string. 
 */
package leetcode_string;

public class ImplementStrStr {
	
	public static int solution (String haystack, String needle) {
		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("hello", "ll"));
	}

}
