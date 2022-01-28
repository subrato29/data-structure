/**
 * 1002. Find Common Characters
Easy

2056

177

Add to List

Share
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CommonChars {

    public List < String > commonChars(String[] words) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (char ch: words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            Iterator < Character > itr = map.keySet().iterator();
            while (itr.hasNext()) {
                char key = itr.next();
                if (words[i].indexOf(key) != -1) {
                    map.put(key, Math.min(map.get(key), getMap(words[i]).get(key)));
                } else {
                    map.remove(key);
                    itr = map.keySet().iterator();
                }
            }
        }
        ArrayList < String > common_char = new ArrayList < String > ();
        Iterator < Character > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            char key = itr.next();
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                common_char.add(String.valueOf(key));
            }
        }
        return common_char;
    }

    public HashMap < Character, Integer > getMap(String string) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (char ch: string.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}