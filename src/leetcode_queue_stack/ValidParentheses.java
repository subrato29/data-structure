package leetcode_queue_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean solution(String input) {
        Map < Character, Character > map = new HashMap < > ();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack < Character > stack = new Stack < Character > ();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);

            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
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