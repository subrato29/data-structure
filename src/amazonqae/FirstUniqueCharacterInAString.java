package amazonqae;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	
	public static int solution (String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}
		
		for (int i = 0; i < ch.length; i++) {
			if (map.get(ch[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("loveleetcode"));
	}

}
