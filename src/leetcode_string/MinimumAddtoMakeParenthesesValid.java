/**
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.


Example 1:
Input: "())"
Output: 1

Example 2:
Input: "((("
Output: 3

Example 3:
Input: "()"
Output: 0

Example 4:
Input: "()))(("
Output: 4
 */
package leetcode_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {

    public static int solution(String input) {
        Map < Character, Character > map = new HashMap < > ();
        map.put('(', ')');

        Stack < Character > stack = new Stack();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        return stack.size() + count;
    }

    public static void main(String[] args) {
        String string = "()";
        System.out.println(solution(string));
    }

}