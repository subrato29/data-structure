/**
 * 226. Invert Binary Tree
Easy

9113

128

Add to List

Share
Given the root of a binary tree, invert the tree, and return its root.

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []
 */
package leetcode.binaryTree;

public class Invert_Binary_Tree_226 {

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            swapBinaryTree(root);
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

        public void swapBinaryTree(TreeNode node) {
            TreeNode tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}