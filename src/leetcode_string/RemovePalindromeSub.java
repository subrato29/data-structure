/**
 * Remove Palindromic Subsequences
 * You are given a string s consisting only of letters 'a' and 'b'. In a single step you can remove one palindromic subsequence from s.

Return the minimum number of steps to make the given string empty.

A string is a subsequence of a given string if it is generated by deleting some characters of a given string without changing its order. Note that a subsequence does not necessarily need to be contiguous.

A string is called palindrome if is one that reads the same backward as well as forward.

Example 1:
Input: s = "ababa"
Output: 1
Explanation: s is already a palindrome, so its entirety can be removed in a single step.

Example 2:
Input: s = "abb"
Output: 2
Explanation: "abb" -> "bb" -> "". 
Remove palindromic subsequence "a" then "bb".

Example 3:
Input: s = "baabb"
Output: 2
Explanation: "baabb" -> "b" -> "". 
Remove palindromic subsequence "baab" then "b".
 */
package leetcode_string;

public class RemovePalindromeSub {

	public int removePalindromeSub(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            return 1;
        }
        return 2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(str.length());
	}

}
