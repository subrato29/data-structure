/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
 */

package leetcode_string;

public class ToLowerCase {

	public String toLowerCase(String str) {
        StringBuffer res = new StringBuffer();
        for(int i=0;i<str.length();i++)
          if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
            res.append((char)(str.charAt(i) + ('a' - 'A')));   
          }else {
            res.append(str.charAt(i));   
          }
        return res.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 == 2);
	}

}
