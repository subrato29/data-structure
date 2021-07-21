/**
 * 961. N-Repeated Element in Size 2N Array

 * In a array nums of size 2 * n, there are n + 1 unique elements, and exactly one of these elements is repeated n times.

Return the element repeated n times.

Example 1:
Input: nums[1,2,3,3]
Output: 3

Example 2:
Input: nums[2,1,2,5,3,2]
Output: 2

Example 3:
Input: nums[5,1,5,2,5,3,5,4]
Output: 5
 */

package leetcode_hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepeatedNTimes {

    public int repeatedNTimes(int[] nums) {
        Map < Integer, Integer > map = new HashMap < Integer, Integer > ();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = nums.length / 2;

        if (n + 1 == map.size()) {
            Iterator < Integer > itr = map.keySet().iterator();
            while (itr.hasNext()) {
                int key = itr.next();
                if (map.get(key) == n) {
                    return key;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}