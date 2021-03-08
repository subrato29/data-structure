package leetcode_aug;

public class ValidPalindrome {

	public static boolean solution (String s) {
		s = s.replaceAll ("[^a-zA-Z0-9]", "");
		int len = s.length();
		
		for (int i = 0; i < len/2; i++) {
			String c1 = Character.toString(s.charAt(i));
			String c2 = Character.toString(s.charAt(len - i - 1));
			if (!c1.equalsIgnoreCase(c2)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		System.out.println(solution (str));
	}

}
