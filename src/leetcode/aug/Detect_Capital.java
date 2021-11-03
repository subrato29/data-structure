package leetcode.aug;

import java.util.HashMap;
import java.util.Map;

public class Detect_Capital {

	public static boolean detectCapitalUse(String word) {
		
		boolean upper = false;
		boolean lower = false;
		int count = 0;
		
		for (int i = 0; i<word.length(); i++) {
			boolean bool = false;
			char curr = word.charAt(i);
			if (Character.isUpperCase(curr)) {
				bool = true;
				count ++;
			}
			if (count == word.length() && bool) {
				return true;
			}
		}
		
		for (int i = 0; i<word.length(); i++) {
			char curr = word.charAt(i);
			Map<Integer, Character> map = new HashMap<>();
			map.put (i, curr);
			if (Character.isUpperCase(curr)) {
				upper = true;
			} else {
				lower = true;
			}
			if (Character.isUpperCase(word.charAt(0))) {
				if (i > 0  && Character.isUpperCase(map.get(i))) {
					return false;
				}
			}
			if (!Character.isUpperCase(word.charAt(0)) && upper && lower) {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("LEET"));
	}

}
