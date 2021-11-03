/**
 * 1055. Shortest Way to Form String
From any string, we can form a subsequence of that string by deleting some number of characters (possibly no deletions).

Given two strings source and target, return the minimum number of subsequences of source such that their concatenation equals target. If the task is impossible, return -1.

Example 1:
Input: source = "abc", target = "abcbc"
Output: 2
Explanation: The target "abcbc" can be formed by "abc" and "bc", which are subsequences of source "abc".

Example 2:
Input: source = "abc", target = "acdbc"
Output: -1
Explanation: The target string cannot be constructed from the subsequences of source string due to the character "d" in target string.

Example 3:
Input: source = "xyz", target = "xzyxz"
Output: 3
Explanation: The target string can be constructed as follows "xz" + "y" + "xz".
 */

package leetcode.twopointer;

public class Shortest_Way_to_Form_String {

    public static int shortestWay(String source, String target) {
        int countOfWay = 0;
        while (target.length() > 0) {
            StringBuilder subseq = new StringBuilder();
            int i = 0;
            int j = 0;
            while (i < source.length() && j < target.length()) {
                if (source.charAt(i++) == target.charAt(j)) {
                    subseq.append(target.charAt(j++));
                }
            }
            if (subseq.length() == 0) {
                return -1;
            }
            countOfWay++;
            target = target.substring(subseq.length());
        }
        return countOfWay;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(shortestWay("xyz", "xzyxz"));
    }

}