// Use any preferable coding question

// Write a function which takes a 'string' input which contains series of braces (open and closed : {, (, [ ) and returns 0 if the braces are not proper or else returns the count of valid braces(ordering and braces precedence is ignored).

// E.g. 
// Input : ({}])  ; Output : 0
// Input : (){[]} ; Output : 3
// Input : ({[])} ; Output : 3
// Input : ({)} ; Output : 2
// Input : abcde ; Output : 0
// Input : () {{{{{{{ ; Ouput : 0

package company.lyft;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidStringLength {

	public static int solution (String str) {
	      Map <Character, Character> map = new HashMap<>();
	      map.put ('(', ')');
	      map.put ('{', '}');
	      map.put ('[', ']');

	      Stack<Character> stack = new Stack ();

	      for (int i = 0; i < str.length(); i++) {
	        char curr = str.charAt(i);

	        if (map.keySet().contains(curr)) {
	          stack.push (curr);
	        } else if (map.values().contains(curr)) {
	            if (!stack.empty()) {
	              stack.pop ();
	            }
	         }
	      }
	      if (stack.empty ()) {
	        return str.length() / 2;
	      }
	      return 0;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution ("{}([)]["));
		String string = "abcdefg";
		System.out.println(string.substring(0, 2));
	}

}
