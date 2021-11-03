/**
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */
package leetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

	public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        List<Character> listOfVowels = new ArrayList<Character>();
        for (int i = 0; i < vowel.length(); i++) {
            listOfVowels.add (vowel.charAt(i));
        }
        int left = 0;
        int right = s.length() - 1;
        char[] array = s.toCharArray();
        while (left <= right) {
            if (!listOfVowels.contains(array[left])) {
                left++;
                continue;
            }
            if (!listOfVowels.contains(array[right])) {
                right--;
                continue;
            }
            helper(array, left, right);
            left++;
            right--;
        }
        return new String(array);
    }
    
    public void helper (char[] array, int left, int right) {
        char temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
