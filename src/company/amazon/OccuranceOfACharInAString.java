//Write a script to print the no. of occurrences of a given character or all letters in a string.

package company.amazon;

public class OccuranceOfACharInAString {

	public static int solution (String str, String a) {
		
		char[] curr = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i< curr.length; i++) {
			if (String.valueOf (curr[i]).equals(a)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("bcabcaat", "a"));
	}

}
