/**
 * Given an input string, reverse the string word by
 * word.
 *
 * <p>For example, Given s = "the sky is blue", return "blue is sky the".
 *
 * <p>Clarification: What constitutes a word? A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces? Yes. However, your reversed string
 * should not contain leading or trailing spaces. How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 */
package leetcode_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseWordsInAString {
	public static String solution (String string) {
		Set<String> set = new LinkedHashSet<String>();		
		String[] array = string.split(" ");
		for (int i = 0; i < array.length; i++) {
			set.add(array[i].trim());
		}
		List<String> list = new ArrayList<String>(set);
		Collections.reverse(list);

		StringBuilder sb = new StringBuilder();
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			sb.append(itr.next() + " ");
		}
		return sb.toString();
 	}
	public static void main(String[] args) {
		System.out.println(solution ("       the sky       is   blue"));
	}

}
