/**
 * 599. Minimum Index Sum of Two Lists
Easy

1050

302

Add to List

Share
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 */
package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < String, Integer > map = new HashMap < String, Integer > ();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map.put(list2[i] + "-DUPL", map.get(list2[i]) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        Iterator < String > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            int value = map.get(key);
            if (key.indexOf("-DUPL") != -1) {
                value = map.get(key);
                if (min > value) {
                    min = value;
                }
            } else if (key.indexOf("-DUPL") == -1) {
                map.remove(key);
                itr = map.keySet().iterator();
            }
        }
        ArrayList < String > list = new ArrayList < > ();
        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            int value = map.get(key);
            if (key.indexOf("-DUPL") != -1) {
                value = map.get(key);
            }
            if (min == value) {
                list.add(key.replace("-DUPL", ""));
            }
        }
        String[] arr = new String[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}