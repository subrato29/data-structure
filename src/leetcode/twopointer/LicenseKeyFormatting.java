/**
 * 482. License Key Formatting Easy
 *
 * 662
 *
 * 962
 *
 * Add to List
 *
 * Share You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
 * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 *
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group,
 * which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash
 * inserted between two groups, and you should convert all lowercase letters to uppercase.
 *
 * Return the reformatted license key.
 *
 * Example 1: Input: s = "5F3Z-2e-9-w", k = 4 Output: "5F3Z-2E9W" Explanation: The string s has been split into two
 * parts, each part has 4 characters. Note that the two extra dashes are not needed and can be removed.
 *
 * Example 2: Input: s = "2-5g-3-J", k = 2 Output: "2-5G-3J" Explanation: The string s has been split into three parts,
 * each part has 2 characters except the first part as it could be shorter as mentioned above.
 */
package leetcode.twopointer;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int index = s.length() - 1;
        s = s.toUpperCase();
        int counterToReachK = 0;

        while (index >= 0) {
            char ch = s.charAt(index);
            if (ch != '-') {
                result.append(ch);
                counterToReachK++;
                if (counterToReachK == k) {
                    result.append('-');
                    counterToReachK = 0;
                }
            }
            index--;
        }
        if (result.length() == 0) {
            return result.toString();
        }
        if (result.reverse()
                .charAt(0) == '-') {
            return result.substring(1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}