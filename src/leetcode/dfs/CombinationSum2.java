/**
 * 40. Combination Sum II
Medium

4149

112

Add to List

Share
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 */

package leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> result = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombination(candidates, 0, target, new ArrayList < Integer > (), result);
        return result;
    }

    public void findCombination(int[] candidates, int index, int target, List < Integer > current, List < List < Integer >> result) {
        if (target == 0) {
            result.add(new ArrayList < Integer > (current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i == index || candidates[i] != candidates[i - 1]) {
                current.add(candidates[i]);
                findCombination(candidates, i + 1, target - candidates[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}