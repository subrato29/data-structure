/**
 * Given a binary array, find the maximum length of a
 * contiguous subarray with equal number of 0 and 1.
 *
 * <p>Example 1: Input: [0,1] Output: 2 Explanation: [0, 1] is the longest contiguous subarray with
 * equal number of 0 and 1. Example 2: Input: [0,1,0] Output: 2 Explanation: [0, 1] (or [1, 0]) is a
 * longest contiguous subarray with equal number of 0 and 1. Note: The length of the given binary
 * array will not exceed 50,000.
 *
 * <p>Solution: O(n) keep a count variable and increment count when a 1 is found and decrement count
 * when a 0 is found. Maintain a map of count and its corresponding index. if the count repeats
 * itself then take the difference of the current index and the index saved in the map. Max of the
 * difference is the answer.
 */
package leetcode_hashing;

public class ContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
