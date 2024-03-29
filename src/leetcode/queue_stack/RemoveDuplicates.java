/**
 * 1047. Remove All Adjacent Duplicates In String
 *
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two
 * adjacent and equal letters and removing them.
 *
 * We repeatedly make duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is
 * unique.
 *
 * Example 1: Input: s = "abbaca" Output: "ca" Explanation: For example, in "abbaca" we could remove "bb" since the
 * letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is
 * "aaca", of which only "aa" is possible, so the final string is "ca".
 *
 * Example 2: Input: s = "azxxzy" Output: "ay"
 *
 * Ref: https://www.youtube.com/watch?v=I7xTXJ4OfD4
 */

package leetcode.queue_stack;

import java.util.Stack;

public class RemoveDuplicates {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == ch) {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}