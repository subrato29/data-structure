/**
 * 20. Valid Parentheses Easy 20K 1.2K Companies Given a string s containing just the characters '(', ')', '{', '}', '['
 * and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Every
 * close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1: Input: s = "()" Output: true
 *
 * Example 2: Input: s = "()[]{}" Output: true
 *
 * Example 3: Input: s = "(]" Output: false
 */
package leetcode.queue_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean solution(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            }
            else if (map.containsValue(ch)) {
                if (!stack.empty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}