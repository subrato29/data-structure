package leetcode_string;

public class CharSequenceInWordWithPosition {

	public static String solution (String input) {
		String output = "";
		int count = 1;
		char next = 0;
		
		for (int i = 0; i < input.length() - 1; i++) {
			char curr = input.charAt (i);
			next = input.charAt (i + 1);
			if (curr == next) {
				count++;
			} else {
				output = output + curr + count;
				count = 1;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "abaaaabccddef";
		//String input = "aaabbcdddefggg";
		System.out.println(solution (input));
	}

}
