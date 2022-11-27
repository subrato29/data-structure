/**
 * 113. Path Sum II
Medium

3059

88

Add to List

Share
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where each path's sum equals targetSum.

A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: []

Example 3:
Input: root = [1,2], targetSum = 0
Output: []

https://www.youtube.com/watch?v=3B5gnrwRmOA
 */
package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List < List < Integer >> pathSum(TreeNode root, int targetSum) {
        ArrayList < List < Integer >> list = new ArrayList < List < Integer >> ();
        pathSumHelper(root, list, new ArrayList < Integer > (), targetSum);
        return list;
    }

    public void pathSumHelper(TreeNode node, ArrayList < List < Integer >> list, ArrayList < Integer > path, int sum) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (sum == node.val && node.left == null && node.right == null) {
            list.add(path);
            return;
        }
        pathSumHelper(node.left, list, new ArrayList < Integer > (path), sum - node.val);
        pathSumHelper(node.right, list, new ArrayList < Integer > (path), sum - node.val);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}