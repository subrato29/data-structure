/**
 * 1249. Minimum Remove to Make Valid Parentheses
Medium

3621

69

Add to List

Share
Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 
Example 1:
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.

Example 2:
Input: s = "a)b(c)d"
Output: "ab(c)d"

Example 3:
Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
 */
package leetcode.queue_stack;

import java.util.HashMap;
import java.util.Stack;

public class MinRemoveToMakeValid {

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            sb.append(ch);
        }
        String string = sb.toString();
        if (open == 0) {
            return string;
        }
        StringBuilder result = new StringBuilder();
        int i = string.length() - 1;
        while (i >= 0) {
            char ch = string.charAt(i);
            if (ch == '(' && open-- > 0) {
                i--;
                continue;
            }
            result.append(ch);
            i--;
        }
        return result.reverse().toString();
    }

    public String minRemoveToMakeValid1(String s) {
        HashMap < Character, Character > map = new HashMap < Character, Character > ();
        map.put('(', ')');
        Stack < Character > stack = new Stack < Character > ();
        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if (map.keySet().contains(ch)) {
                sb.append(ch);
                stack.push(ch);
            } else if (map.values().contains(ch)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == ch) {
                    sb.append(ch);
                    stack.pop();
                } else {
                    continue;
                }
            } else {
                sb.append(ch);
            }
        }
        String string = sb.toString();
        if (stack.size() == 0) {
            return string;
        }
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            if (ch == '(' && stack.size() > 0) {
                stack.pop();
                continue;
            }
            result.append(ch);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}