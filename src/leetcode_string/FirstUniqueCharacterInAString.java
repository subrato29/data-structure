/**
 * Given a string, find the first non-repeating
 * character in it and return it's index. If it doesn't exist, return -1.
 *
 * <p>Examples:
 *
 * <p>s = "leetcode" return 0.
 *
 * <p>s = "loveleetcode", return 2. Note: You may assume the string contain only lowercase letters.
 */
package leetcode_string;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	
	public static void solution (String string) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				count++;
			} else {
				count = 0;
			}
			map.put(ch, count);
		}
		Iterator<Character> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			char key = itr.next();
			int value = map.get(key);
			if (value == 0) {
				System.out.print("first non repeating chr: " + key);
				System.out.println(" and index is: " + string.indexOf(key));
				break;
			}
		}
	}

	public static void main(String[] args) {
		solution("loveleetcode");
	}

}
