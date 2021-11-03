package leetcode.twopointer;

public class IsLongPressedName {

	 public static boolean isLongPressedName(String name, String typed) {
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            while (index < typed.length() && name.charAt(i) != typed.charAt(index)) {
            	index++;
            }
            if (index >= typed.length()) {
            	return false;
            }
            index++;
        }
        return true;
    }
	public static void main(String[] args) {
		//System.out.println(isLongPressedName("leelee", "lleeelee"));
		System.out.println("leetcode".startsWith("leed"));
	}

}
