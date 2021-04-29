/**
 *Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 
 */

package leetcode_twopointer;

public class ReverseWords {

	public String reverseWords(String s) {
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            char[] ch = array[i].toCharArray();
            array[i] = reverseString(ch);
        }
        return String.join(" ", array);
    }
    
    public String reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            helper(left, right, s);
            left++;
            right--;
        }
        return new String(s);
    }
    
    public void helper (int left, int right, char[] array) {
        char temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
