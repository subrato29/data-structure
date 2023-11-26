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
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        triangle.add(firstRow);

        for(int i = 1; i < numRows; i++) {
            List <Integer> prevRow = triangle.get(i - 1);
            List <Integer> currRow = new ArrayList <Integer> ();

            currRow.add(1);
            for (int prevColIndexOfPrevRow = 1; prevColIndexOfPrevRow < i; prevColIndexOfPrevRow++) {
                currRow.add(prevRow.get(prevColIndexOfPrevRow - 1) + prevRow.get(prevColIndexOfPrevRow));
            }
            currRow.add(1);

            triangle.add(currRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}