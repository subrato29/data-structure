package company.apple;

public class IsPalindrome {

	public static boolean isPalindrome(String str1, String str2) {
		String reverseString = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reverseString += str1.charAt(i);
		}
		return reverseString.equals(str2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome ("tree", "eert"));
	}

}
