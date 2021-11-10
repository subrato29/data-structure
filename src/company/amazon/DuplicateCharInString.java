//Write code to count the duplicate characters in a given string.

package company.amazon;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharInString {

	public static int solution (String input) {
		Set<Character> set = new TreeSet<Character>();
		
		int count = 0;
		
		int initLen = input.length();
		
		char[] ch = input.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			set.add (ch[i]);
		}
		int resultLen = set.size();
		
		count = initLen - resultLen;
		
		if (count > 0) {
			return count + 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("abaacvdrf"));

	}

}
