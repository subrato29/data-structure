/**
 * S and T are strings composed of lowercase letters.
 * In S, no letter occurs more than once.
 *
 * <p>S was sorted in some custom order previously. We want to permute the characters of T so that
 * they match the order that S was sorted. More specifically, if x occurs before y in S, then x
 * should occur before y in the returned string.
 *
 * <p>Return any permutation of T (as a string) that satisfies this property.
 *
 * <p>Example : Input: S = "cba" T = "abcd" Output: "cbad" Explanation: "a", "b", "c" appear in S,
 * so the order of "a", "b", "c" should be "c", "b", and "a". Since "d" does not appear in S, it can
 * be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
 *
 * <p>Note:
 *
 * <p>S has length at most 26, and no character is repeated in S. T has length at most 200. S and T
 * consist of lowercase letters only.
 *
 * <p>Solution: O(N) count occurrence of each character and write to the output string
 */
package leetcode_hashing;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomSortString {

	public static String solution (String string1, String string2) {
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < string1.length(); i++) {
			char ch = string1.charAt(i);
			set.add(String.valueOf(ch));
		}
		for (int i = 0; i < string2.length(); i++) {
			char ch = string2.charAt(i);
			set.add(String.valueOf(ch));
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			sb.append(itr.next());
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution ("cba", "abcd"));
	}

}
