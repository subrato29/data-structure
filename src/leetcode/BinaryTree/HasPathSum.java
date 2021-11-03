/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false

Example 3:
Input: root = [1,2], targetSum = 0
Output: false
 */

package leetcode.BinaryTree;

import java.util.ArrayList;

public class HasPathSum {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {
            return false;
        }
        ArrayList < Integer > listOfSum = new ArrayList < Integer > ();
        hasPathSumHelper(root, 0, listOfSum);
        return listOfSum.contains(targetSum);
    }

    public void hasPathSumHelper(TreeNode root, int branchSum, ArrayList < Integer > listOfSum) {
        if (root == null) {
            return;
        }
        branchSum += root.val;
        if (root.left == null && root.right == null) {
            listOfSum.add(branchSum);
            return;
        }
        hasPathSumHelper(root.left, branchSum, listOfSum);
        hasPathSumHelper(root.right, branchSum, listOfSum);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}