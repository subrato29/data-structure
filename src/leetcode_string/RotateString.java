/**
 * We are given two strings, A and B.

	A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
	
	Example 1:
	Input: A = 'abcde', B = 'cdeab'
	Output: true
	
	Example 2:
	Input: A = 'abcde', B = 'abced'
	Output: false
 */
package leetcode_string;

public class RotateString {

	public static boolean solution (String string1, String string2) {
		if (string1 == "" & string2 == "") {
			return true;
		}
		if (string1 == null & string2 ==null) {
			return true;
		}
		if (string1 == "" || string2 == "") {
			return string1.equals(string2);
		}
		char beginIndexChar = string2.charAt(0);
		int i = string1.indexOf(beginIndexChar);
		
		int begin = 0;
		String newString1 = "";
		while (begin < i) {
			newString1 += string1.charAt(begin);
			begin++;
		}
		
		String newString = "";
		while (i < string1.length()) {
			newString += string1.charAt(i);
			i++;
		}
		
		newString = newString + newString1;
		return newString.equals(string2);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("", ""));
	}

}
