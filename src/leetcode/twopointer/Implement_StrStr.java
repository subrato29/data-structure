/**
 * 28. Find the Index of the First Occurrence in a String
 *
 * Easy 4.2K 220
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 *
 * Example 1: Input: haystack = "sadbutsad", needle = "sad" Output: 0 Explanation: "sad" occurs at index 0 and 6. The
 * first occurrence is at index 0, so we return 0.
 *
 * Example 2: Input: haystack = "leetcode", needle = "leeto" Output: -1 Explanation: "leeto" did not occur in
 * "leetcode", so we return -1.
 */

package leetcode.twopointer;

public class Implement_StrStr {

    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int haystackPointer = 0;
        int needlePointer = 0;
        int restartPoiter = 0;

        while (haystackPointer < haystack.length()) {
            if (haystack.charAt(haystackPointer) == needle.charAt(needlePointer)) {
                needlePointer++;
                if (needlePointer == needle.length()) {
                    return haystackPointer - needlePointer + 1;
                }
            }
            else {
                needlePointer = 0;
                haystackPointer = restartPoiter;
                restartPoiter++;
            }
            haystackPointer++;
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }

}
