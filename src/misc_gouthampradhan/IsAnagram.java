package misc_gouthampradhan;

import java.util.Set;
import java.util.TreeSet;

public class IsAnagram {

	public static boolean isAnagram (String a, String b) {
		Set<Character> set1 = new TreeSet<>();
		Set<Character> set2 = new TreeSet<>();
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		for (int i = 0; i < a1.length; i++) {
			set1.add(a1[i]);
		}
		for (int i = 0; i < b1.length; i++) {
			set2.add(b1[i]);
		}
		return set1.equals(set2);
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram ("abcd", "dbca"));
	}

}
