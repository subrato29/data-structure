/**
 * 1331. Rank Transform of an Array
Easy

540

42

Add to List

Share
Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.

Example 1:
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:
Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Example 3:
Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]
 */

package leetcode_hashing;

import java.util.Iterator;
import java.util.TreeMap;

public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        TreeMap < Integer, Integer > map = new TreeMap < Integer, Integer > ();
        int i = 0;
        while (i < arr.length) {
            map.put(arr[i], 0);
            i++;
        }
        int counter = 1;
        Iterator < Integer > itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            map.put(key, map.get(key) + counter);
            counter++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (map.keySet().contains(arr[j])) {
                arr[j] = map.get(arr[j]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}