/**
 * 118. Pascal's Triangle
Easy

6345

221

Add to List

Share
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 */
package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

    class Solution {
        public List < List < Integer >> generate(int numRows) {
            List < List < Integer >> triangle = new ArrayList < > ();

            if (numRows == 0) {
                return triangle;
            }

            List < Integer > first_row = new ArrayList < Integer > ();
            first_row.add(1);
            triangle.add(first_row);

            for (int i = 1; i < numRows; i++) {
                List < Integer > prev_row = triangle.get(i - 1);
                List < Integer > curr_row = new ArrayList < Integer > ();

                curr_row.add(1);
                for (int j = 1; j < i; j++) {
                    curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
                }
                curr_row.add(1);
                triangle.add(curr_row);
            }
            return triangle;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}