package recursion.functional;

public class IsPalindrome {

    public static boolean isPalindrome (String string, int left, int right) {
        if (string.length() == 0) {
            return true;
        }
        if (left == right) {
            return true;
        }
        if (string.charAt(left) != string.charAt(right)) {
            return false;
        }
        return isPalindrome(string, left + 1, right - 1);
    }

    public static void main (String[] args) {
        String string = "madam";
        System.out.println(isPalindrome(string, 0, string.length() - 1));
    }
}
