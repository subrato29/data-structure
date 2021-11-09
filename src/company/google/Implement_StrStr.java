/**
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:
Input: haystack = "", needle = ""
Output: 0
 */

package company.google;

public class Implement_StrStr {

	public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }

        int haystack_pointer = 0;
        int needle_pointer = 0;

        while(haystack_pointer < haystack.length()){
            if(haystack.charAt(haystack_pointer) == needle.charAt(needle_pointer)){
                needle_pointer++;
                if(needle_pointer == needle.length()){
                    return haystack_pointer - needle_pointer + 1;
                }
            }else{
                haystack_pointer = haystack_pointer - needle_pointer;
                needle_pointer = 0;
            }
            haystack_pointer++;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(strStr("Happy birthday", "py"));
		System.out.println("ababc".substring(0, 1));
	}

}
