/**
 * Given two strings s and t, write a function to
 * determine if t is an anagram of s.
 *
 * <p>For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car", return false.
 *
 * <p>Note: You may assume the string contains only lowercase alphabets.
 *
 * <p>Follow up: What if the inputs contain unicode characters? How would you adapt your solution to
 * such case?
 */
package leetcode_hashing;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean solution(String string1, String string2) {
        char[] ch = string1.toCharArray();
        Arrays.sort(ch);
        String sorted1 = new String(ch);

        ch = string2.toCharArray();
        Arrays.sort(ch);
        String sorted2 = new String(ch);
        return sorted1.equals(sorted2);
    }

    public static void main(String[] args) {
        System.out.println(solution("anagram", "nagaram"));
    }

}