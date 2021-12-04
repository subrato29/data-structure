package leetcode.misc1;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	public static int solution (String str) {
		Map <Character, Integer> map = new HashMap<>();
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			map.put (ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		for (int i = 0; i < len; i++) {
			if (map.get(str.charAt(i)) == 1) {
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
