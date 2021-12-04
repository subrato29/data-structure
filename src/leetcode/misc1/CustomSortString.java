package leetcode.misc1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomSortString {

	public static String solution (String S, String T) {
		Map<Character, Integer> map = new HashMap<>();
		
		List<Character> list_T = new ArrayList<>();
		List<Character> list_common = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < S.length(); i++) {
			map.put(S.charAt(i), i);
		}
		
		for (int i = 0; i < T.length(); i++) {
			if (!map.containsKey(T.charAt(i))) {
				list_T.add(T.charAt(i));
			} else {
				list_common.add(T.charAt(i));
			}
		}
		
		for (int i = 0 ; i < list_common.size(); i++) {
			sb.append(list_common.get(i));
		}
		
		for (int i = 0 ; i < list_T.size(); i++) {
			sb.append(list_T.get(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("crah", "abcdf"));
	}

}
