/**
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

 */

package leetcode_string;

public class CountConsistentStrings {

	public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            counter += helper(allowed, words[i]);
        }
        return counter;
    }
    
    public int helper (String allowed, String word) {
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (allowed.indexOf(array[i]) == -1) {
                return 0;
            }
        }
        return 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
