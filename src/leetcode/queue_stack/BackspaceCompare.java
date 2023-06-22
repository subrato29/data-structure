/**
 * 844. Backspace String Compare Easy
 *
 * 2556
 *
 * 118
 *
 * Add to List
 *
 * Share Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means
 * a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1: Input: s = "ab#c", t = "ad#c" Output: true Explanation: Both s and t become "ac".
 *
 * Example 2: Input: s = "ab##", t = "c#d#" Output: true Explanation: Both s and t become "".
 *
 * Example 3: Input: s = "a##c", t = "#a#c" Output: true Explanation: Both s and t become "c".
 *
 * Example 4: Input: s = "a#c", t = "b" Output: false Explanation: s becomes "c" while t becomes "b".
 */
package leetcode.queue_stack;

import java.util.Stack;

public class BackspaceCompare {

    public boolean backspaceCompare(String s, String t) {
        return getStringWithoutBackspace(s).equals(getStringWithoutBackspace(t));
    }

    public String getStringWithoutBackspace(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == '#') {
                stack.pop();
            }
            else if (ch != '#') {
                stack.push(ch);
            }
        }
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<Character> stack = new Stack<>();
        String gfg1 = String.join("-", "");
        System.out.println(gfg1);
    }

}