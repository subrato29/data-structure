package leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Easy
 * 8.4K
 * 280
 * Companies
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 *Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 */


public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        triangle.add(firstRow);

        for(int i = 1; i < numRows; i++) {
            List <Integer> prevRow = triangle.get(i - 1);
            List <Integer> currRow = new ArrayList <Integer> ();

            currRow.add(1);
            for (int prevColIndex = 1; prevColIndex < i; prevColIndex++) {
                currRow.add(prevRow.get(prevColIndex - 1) + prevRow.get(prevColIndex));
            }
            currRow.add(1);

            triangle.add(currRow);
        }

        return triangle;
    }
}
