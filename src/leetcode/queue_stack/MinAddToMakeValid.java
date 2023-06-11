/**
 * 921. Minimum Add to Make Parentheses Valid
 *
 * Given a string s of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any
 * positions ) so that the resulting parentheses string is valid.
 *
 * Formally, a parentheses string is valid if and only if:
 *
 * It is the empty string, or It can be written as AB (A concatenated with B), where A and B are valid strings, or It
 * can be written as (A), where A is a valid string. Given a parentheses string, return the minimum number of
 * parentheses we must add to make the resulting string valid.
 *
 * Example 1: Input: s = "())" Output: 1
 *
 * Example 2: Input: s = "(((" Output: 3
 *
 * Example 3: Input: s = "()" Output: 0
 *
 * Example 4: Input: s = "()))((" Output: 4
 */

package leetcode.queue_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinAddToMakeValid {

    public static int minAddToMakeValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');

        Stack<Character> stack = new Stack();
        int countOfUnbalancedClosedParenthesis = 0;
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            }
            else if (map.containsValue(ch)) {
                if (!stack.empty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                }
                else {
                    countOfUnbalancedClosedParenthesis++;
                }
            }
        }
        return stack.size() + countOfUnbalancedClosedParenthesis;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        minAddToMakeValid("()");
    }

}