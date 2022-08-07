/**
 * 104. Maximum Depth of Binary Tree
Easy

7940

135

Add to List

Share
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2
 */

package leetcode.binary_tree;

public class MaxDepth_9 {

    public int maxDepth(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;

        if (root == null) {
            return 0;
        }
        leftDepth = maxDepth(root.left);
        rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}