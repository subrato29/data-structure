/**
 * Example 1:

	Input: s1 = "ab" s2 = "eidbaooo"
	Output: True
	Explanation: s2 contains one permutation of s1 ("ba").
	Example 2:
	
	Input:s1= "ab" s2 = "eidboaoo"
	Output: False
 */
package leetcode.string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationInString {

    public static boolean solution(String string1, String string2) {

        if (string1 == "") {
            return false;
        }

        if (string1 == "" && string2 == "") {
            return true;
        }

        if (string1.length() == string2.length()) {
            if (sorted(string1).equals(sorted(string2))) {
                return true;
            } else {
                return false;
            }
        }

        int start = string2.indexOf(string1.substring(0, 1));
        int end = string2.length();

        if (start == -1) {
            return false;
        }

        int targetLength = string1.length();
        String expected = sorted(string1);

        while (start <= end - targetLength) {
            String stringToValidate = string2.substring(start, start + targetLength);
            String actual = sorted(stringToValidate);
            if (expected.equals(actual)) {
                return true;
            }
            stringToValidate = string2.substring(start - targetLength + 1, start + 1);
            actual = sorted(stringToValidate);
            if (expected.equals(actual)) {
                return true;
            }
            start++;
            int next = string2.substring(start, end).indexOf(string1.substring(0, 1));
            if (next == -1) {
                return false;
            }
            start += next;
            if (start == end - 1) {
                stringToValidate = string2.substring(start - targetLength + 1, start + 1);
                actual = sorted(stringToValidate);
                if (expected.equals(actual)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String sorted(String string) {
        List < String > list = new ArrayList < String > ();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.substring(i, i + 1));
        }
        Collections.sort(list);
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("ab", "eidbaooo"));
    }

}