package company.ebay;

import java.util.HashSet;
import java.util.Set;

public class FirstOccuranceOfChar {

	public static String solution (String string) {
	    Set<Character> set = new HashSet<Character>();
	    String[] array = string.split(" ");
	    String temp = "";
	    for (int i = 0; i < array.length; i++) {
	      temp += array[i];
	    }
	    string = temp;
	    for (int i = 0; i < string.length(); i++) {
	      char ch = string.charAt(i);
	      if (set.contains(ch)) {
	        return String.valueOf(ch);
	      }else {
	        set.add(ch);
	      }
	    }
	    return null;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "I enjoy life at eBay";
		System.out.println(solution(sequence));
	}

}
