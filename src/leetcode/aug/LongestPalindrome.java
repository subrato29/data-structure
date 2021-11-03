/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Example 3:

Input: s = "bb"
Output: 2
*/

package leetcode.aug;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

	public static int solution (String s) {
		if (s == null || s.length() < 1) {
			return 0;	
		}
	    Set<Character> set = new HashSet<>();
	    for (int i = 0; i < s.length(); i++) {
	        if (set.contains(s.charAt(i))) {
	        	set.remove(s.charAt(i));	
	        }else {
	        	set.add(s.charAt(i));
	        }
	    }
	    if (set.size() <= 1) {
	    	return s.length();	
	    }
	    return s.length() - set.size() + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abccccdde"));
	}

}
