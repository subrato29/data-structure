/**
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

Example 2:
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:

Input: s = "MerryChristmas"
Output: false

Example 4:
Input: s = "AbCdEfGh"
Output: true
 */

package leetcode.string;

public class HalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int counter1 = helper(s.substring(0, half));
        int counter2 = helper(s.substring(half, s.length()));

        return counter1 == counter2;
    }

    public int helper(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if ("AEIOU".indexOf(curr) != -1) {
                counter++;
            } else if ("aeiou".indexOf(curr) != -1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}