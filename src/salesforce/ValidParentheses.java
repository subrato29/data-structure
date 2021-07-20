package salesforce;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	
	public static boolean solution(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			
			if (map.keySet().contains(curr)) {
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
		System.out.println(solution("{()}[]"));
	}

}
