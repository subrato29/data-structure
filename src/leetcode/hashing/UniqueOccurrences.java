/**
 * 1207. Unique Number of Occurrences
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:
Input: arr = [1,2]
Output: false

Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */

package leetcode.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set < Integer > set = new HashSet < Integer > (map.values());
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}