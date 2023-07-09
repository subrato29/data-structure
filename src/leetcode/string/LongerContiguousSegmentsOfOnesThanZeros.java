/**
 * 1869. Longer Contiguous Segments of Ones than Zeros Easy
 *
 * 239
 *
 * 6
 *
 * Add to List
 *
 * Share Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the
 * longest contiguous segment of 0's in s, or return false otherwise.
 *
 * For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment
 * of 0s has length 3. Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a
 * length 0. The same applies if there is no 1's.
 *
 * Example 1: Input: s = "1101" Output: true Explanation: The longest contiguous segment of 1s has length 2: "1101" The
 * longest contiguous segment of 0s has length 1: "1101" The segment of 1s is longer, so return true.
 *
 * Example 2: Input: s = "111000" Output: false Explanation: The longest contiguous segment of 1s has length 3: "111000"
 * The longest contiguous segment of 0s has length 3: "111000" The segment of 1s is not longer, so return false.
 *
 * Example 3: Input: s = "110100010" Output: false Explanation: The longest contiguous segment of 1s has length 2:
 * "110100010" The longest contiguous segment of 0s has length 3: "110100010" The segment of 1s is not longer, so return
 * false.
 */
package leetcode.string;

public class LongerContiguousSegmentsOfOnesThanZeros {

    public boolean checkZeroOnes(String s) {
        int maxLengthOfContinuousOnes = 0;
        int maxLengthOfContinuousZeros = 0;
        int ierator = 0;
        int indexOfOne = 0;
        int indexOfZero = 0;
        while (ierator < s.length()) {
            if (s.charAt(ierator) == '1') {
                indexOfZero = 0;
                maxLengthOfContinuousOnes = Math.max(maxLengthOfContinuousOnes, ++indexOfOne);
            }
            else if (s.charAt(ierator) == '0') {
                indexOfOne = 0;
                maxLengthOfContinuousZeros = Math.max(maxLengthOfContinuousZeros, ++indexOfZero);
            }
            ierator++;
        }
        return maxLengthOfContinuousOnes > maxLengthOfContinuousZeros;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}