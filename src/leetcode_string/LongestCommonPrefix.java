/**
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */
package leetcode_string;

public class LongestCommonPrefix {
	public static String solution (String[] array) {
		if (array.length == 1) {
			return null;
		}
		if (array.length == 0) {
			return null;
		}
		String str = "";
		String firstString = array[0];
		String prefix = "";
		for (int i = 0; i < firstString.length(); i++) {
			str = str + String.valueOf(firstString.charAt(i));
			if (str.length() == 1) {
				prefix = helper (array, str);
				if (prefix == "") {
					return null;
				}
			} else {
				String prev = prefix;
				prefix = helper (array, str);
				if (prefix == "") {
					return prev;
				}
			}
		}
		System.out.println(prefix);
		return null;
	}
	
	public static String helper (String[] array, String prefix) {
		for (int i = 1; i < array.length; i++) {
			if (!array[i].startsWith(prefix)) {
				return "";
			}
		}
		return prefix;
	}
	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		System.out.println(solution(str));
	}

}
