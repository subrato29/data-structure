/*
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

package leetcode.june;

import java.util.Arrays;

public class Reverse_String {
	
	public static void reverseString(char[] s) {
		char[] result = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
        	result[i] = s[i]; 
        }
        for (int i = 0; i<s.length; i++) {
        	System.out.print("'"+s[i]+"'");
        	System.out.print(" ");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'h','e','l','l','o'};
		reverseString(arr);
	}

}
