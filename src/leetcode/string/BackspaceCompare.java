/**
 * 844. Backspace String Compare
Easy

2884

131

Add to List

Share
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".

Example 4:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 */

package src.leetcode.string;

import java.util.Stack;

public class BackspaceCompare {

    public boolean backspaceCompare(String s, String t) {
        return createStringWithoutBackspace(s).equals(createStringWithoutBackspace(t));
    }

    public Stack<Character> createStringWithoutBackspace(String string) {
        Stack<Character> stack = new Stack<>();

        for(char ch : string.toCharArray()) {
            if(ch != '#') {
                stack.push(ch);
            }else if(!stack.empty()) {
                stack.pop();
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}