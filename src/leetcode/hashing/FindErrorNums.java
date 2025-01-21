/**
 * 645. Set Mismatch
Easy

1202

460

Add to List

Share
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
 */
package src.leetcode.hashing;

import java.util.*;

public class FindErrorNums {

    @SuppressWarnings({
        "unchecked",
        "rawtypes"
    })
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet();
        int dup = -1, missing = 1;

        for (int num : nums) {
            if(set.contains(num)) {
                dup = num;
            }else {
                set.add (num);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }

        }
        return new int[] {
                dup,
                missing
        };
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {
            1,
            2,
            2,
            4
        };
        System.out.println(Arrays.toString(findErrorNums(array)));
    }

}