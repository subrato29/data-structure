package misc_gouthampradhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		List<Character> list1 = new ArrayList<>(); 
		List<Character> list2 = new ArrayList<>();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add (arr1[i]);
			Collections.sort(list1);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			list2.add (arr2[i]);
			Collections.sort(list2);
		}
		
		if (list1.equals(list2)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean isAnagram1(String str1, String str2) {
		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			char ch = str1.charAt(i);
			temp = temp + String.valueOf(ch);
		}
		return temp.equals(str2);
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram ("tree", "eret"));

	}

}
