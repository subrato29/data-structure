/**
 * Given an input string, reverse the string word by
 * word. A word is defined as a sequence of non-space characters.
 *
 * <p>The input string does not contain leading or trailing spaces and the words are always
 * separated by a single space.
 *
 * <p>For example, Given s = "the sky is blue", return "blue is sky the".
 *
 * <p>Could you do it in-place without allocating extra space?
 */
package leetcode_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseWordsII {

    public static String solution(String string) {
        List < String > list = new ArrayList < String > ();
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();

        Iterator < String > itr = list.iterator();
        while (itr.hasNext()) {
            sb.append(itr.next() + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("the sky is blue"));
    }

}