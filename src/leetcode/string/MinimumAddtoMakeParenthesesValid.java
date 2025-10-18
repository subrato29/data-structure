/**
 * 921. Minimum Add to Make Parentheses Valid
 * Medium
 *
 * A parentheses string is valid if and only if:
 *
 * It is the empty string,
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
 *
 * For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
 * Return the minimum number of moves required to make s valid.
 *
 * Example 1:
 * Input: s = "())"
 * Output: 1
 *
 * Example 2:
 * Input: s = "((("
 * Output: 3
 */


package src.leetcode.string;

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
            } else if (map.containsValue(curr)) {
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