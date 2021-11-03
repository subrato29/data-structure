/*
 * Given two version numbers, version1 and version2, compare them.

Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.
 

Example 1:
Input: version1 = "1.01", version2 = "1.001"
Output: 0
Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

Example 2:
Input: version1 = "1.0", version2 = "1.0.0"
Output: 0
Explanation: version1 does not specify revision 2, which means it is treated as "0".

Example 3:
Input: version1 = "0.1", version2 = "1.1"
Output: -1
Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.

Example 4:
Input: version1 = "1.0.1", version2 = "1"
Output: 1

Example 5:
Input: version1 = "7.5.2.4", version2 = "7.5.3"
Output: -1
 

Constraints:

1 <= version1.length, version2.length <= 500
version1 and version2 only contain digits and '.'.
version1 and version2 are valid version numbers.
All the given revisions in version1 and version2 can be stored in a 32-bit integer.
 */
package leetcode.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CompareVersionNumbers {

    static String SEPERATOR = "\\.";

    public static int solution(String version1, String version2) {
        if (version1.split(SEPERATOR).length > version2.split(SEPERATOR).length) {
            return helper(version1, version2, true);
        } else if (version1.split(SEPERATOR).length < version2.split(SEPERATOR).length) {
            return helper(version2, version1, false);
        } else {
            return helper(version1, version2, true);
        }
    }

    public static int helper(String bigger, String smaller, boolean bool) {
        Map < Integer, String > map = new HashMap < Integer, String > ();
        for (int i = 0; i < bigger.split(SEPERATOR).length; i++) {
            map.put(i, bigger.split(SEPERATOR)[i]);
        }
        Iterator < Integer > itr = map.keySet().iterator();
        if (bigger.split(SEPERATOR).length == smaller.split(SEPERATOR).length) {
            while (itr.hasNext()) {
                int key = itr.next();
                int value = Integer.parseInt(map.get(key));
                if (value > Integer.parseInt(smaller.split(SEPERATOR)[key])) {
                    return 1;
                } else if (value < Integer.parseInt(smaller.split(SEPERATOR)[key])) {
                    return -1;
                }
            }
        } else if (bigger.split(SEPERATOR).length > smaller.split(SEPERATOR).length) {
            while (itr.hasNext()) {
                int key = itr.next();
                int value = Integer.parseInt(map.get(key));
                if (key < smaller.split(SEPERATOR).length) {
                    if (value > Integer.parseInt(smaller.split(SEPERATOR)[key])) {
                        if (bool) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else if (value < Integer.parseInt(smaller.split(SEPERATOR)[key])) {
                        if (bool) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                } else {
                    if (value > 0) {
                        if (bool) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.0.1.1";
        String version2 = "1.1.0";
        System.out.println(solution(version1, version2));
    }

}