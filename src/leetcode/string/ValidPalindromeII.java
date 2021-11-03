/**
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
	
	Example 1:
	Input: "aba"
	Output: True
	
	Example 2:
	Input: "abca"
	Output: True
	Explanation: You could delete the character 'c'.
 */
package leetcode.string;

public class ValidPalindromeII {

    public static boolean solution(String string) {
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                if (helper(string, start, end - 1)) {
                    return true;
                }
                if (helper(string, start + 1, end)) {
                    return true;
                }
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean helper(String string, int start, int end) {
        while (start <= end) {
            char left = string.charAt(start);
            char right = string.charAt(end);
            if (left != right) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string = "abbcbbbbbba";
        System.out.println(solution(string));
    }

}