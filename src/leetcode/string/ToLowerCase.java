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

package leetcode.string;

public class ToLowerCase {

    public String toLowerCase(String s) {
        String result = "";
        for (char ch: s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public String toLowerCase_1(String str) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                res.append((char)(str.charAt(i) + ('a' - 'A')));
            } else {
                res.append(str.charAt(i));
            }
        return res.toString();
    }

    public static int maxRepeating(String sequence, String word) {
        if (sequence.indexOf(word) == -1) {
            return 0;
        }
        int counter = 0;
        while (sequence.indexOf(word) != -1) {
            counter++;
            int index = sequence.indexOf(word);
            sequence = sequence.substring(index + word.length());
            if (word.length() == sequence.length()) {
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(2 == 2);
        String str = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        //System.out.println(str.substring(2));
        //"aaabaaaabaaabaaaabaaaabaaaabaaaaba"
        //"aaaba"
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

}