/**
 * Given a string, sort it in decreasing order based
 * on the frequency of characters.
 *
 * <p>Example 1:
 *
 * <p>Input: "tree"
 *
 * <p>Output: "eert"
 *
 * <p>Explanation: 'e' appears twice while 'r' and 't' both appear once. So 'e' must appear before
 * both 'r' and 't'. Therefore "eetr" is also a valid answer. Example 2:
 *
 * <p>Input: "cccaaa"
 *
 * <p>Output: "cccaaa"
 *
 * <p>Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer. Note
 * that "cacaca" is incorrect, as the same characters must be together.
 *
 * <p>Example 3:
 *
 * <p>Input: "Aabb"
 *
 * <p>Output: "bbAa"
 *
 * <p>Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect. Note that 'A' and 'a' are
 * treated as two different characters.
 */
package leetcode.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SortCharByFrequency {

    public static String solution(String string) {
        Map < Character, Integer > map = new HashMap < Character, Integer > ();
        int count = 1;
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char key = ch[i];
            if (map.containsKey(key)) {
                count++;
                map.put(key, count);
            } else {
                map.put(key, count);
                count = 1;
            }
        }
        System.out.println(map);

        List < Integer > list = new ArrayList < > (map.values());
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        count = 0;
        Iterator < Character > itr = map.keySet().iterator();
        while (itr.hasNext() && sb.length() < string.length()) {
            char key = itr.next();
            int value = map.get(key);
            if (value == list.get(count) && !sb.toString().contains(String.valueOf(key))) {
                sb.append(helper(String.valueOf(key), value));
                count++;
                itr = map.keySet().iterator();
            }
        }
        return sb.toString();
    }

    public static String helper(String input, int iterator) {
        String str = "";
        for (int i = 0; i < iterator; i++) {
            str += input;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcccgdffraaa"));
    }

}