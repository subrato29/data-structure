package amazonqae;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	
	public static int solution (String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			Integer count = map.get(ch[i]);
			
			if (count == null) {
				count = 1;
			} else {
				count ++;
			}
			map.put (ch[i], count);
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
