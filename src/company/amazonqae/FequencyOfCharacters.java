//Calculate the frequency of characters in a string. Print each char with its frequency. e.g. For input <abcabc>, output should be <(a,2),(b,2),(c,2)>.

package company.amazonqae;

import java.util.HashMap;
import java.util.Map;

public class FequencyOfCharacters {
	
	public static String solution(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}
		str = "";
		for (Map.Entry m : map.entrySet()) {
			str = str + ("(" + m.getKey() + "," + m.getValue() + ")");
		}
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabaaccdf";
		System.out.println(solution(str));
	}

}
