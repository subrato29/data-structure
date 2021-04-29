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

package google;

public class Implement_StrStr {

	public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }

        int s_count = 0;    /*haystack pointer*/
        int n_count = 0;    /*needle pointer*/

        while(s_count < haystack.length()){
            if(haystack.charAt(s_count) == needle.charAt(n_count)){
                n_count++;
                if(n_count == needle.length()){
                    return s_count - n_count + 1;
                }
            }
            else{
                s_count = s_count - n_count;
                n_count = 0;
            }
            s_count++;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
