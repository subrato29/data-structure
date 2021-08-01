package leetcode_queue_stack;

/**
 * 856. Score of Parentheses
Medium

2296

72

Add to List

Share
Given a balanced parentheses string s, compute the score of the string based on the following rule:

() has score 1
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.
 

Example 1:
Input: s = "()"
Output: 1

Example 2:
Input: s = "(())"
Output: 2

Example 3:
Input: s = "()()"
Output: 2

Example 4:
Input: s = "(()(()))"
Output: 6

Ref: https://www.youtube.com/watch?v=jfmJusJ0qKM
 */

import java.util.Stack;

public class ScoreOfParentheses {

    public int scoreOfParentheses(String S) {
        Stack < Integer > stack = new Stack < Integer > ();
        int score = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(score * 2, 1);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}