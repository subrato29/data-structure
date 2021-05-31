/**
 * Remove Outermost Parentheses
 * 
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

 

Example 1:
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:
Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".

O(N) Time, O(N) space
 */
package leetcode_queue_stack;

public class RemoveOuterParentheses {

	public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            }else if (s.charAt(i) == ')') {
                close++;
            }
            if (open == close) {
                sb.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
	}

}
