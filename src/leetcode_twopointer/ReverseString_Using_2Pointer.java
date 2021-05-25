/**
 * Write a function that reverses a string. The input string is given as an array of characters s.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */

package leetcode_twopointer;

public class ReverseString_Using_2Pointer {

	public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            helper(left, right, s);
            left++;
            right--;
        }
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
