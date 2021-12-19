/**
 * 1089. Duplicate Zeros
Easy

1364

454

Add to List

Share
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
 */

package leetcode.array;

import java.util.ArrayList;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        for (Integer ele: arr) {
            if (ele == 0) {
                list.add(0);
                list.add(0);
            } else {
                list.add(ele);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}