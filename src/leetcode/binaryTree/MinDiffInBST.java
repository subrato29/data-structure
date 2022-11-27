/**
 * 783. Minimum Distance Between BST Nodes
Easy

1200

272

Add to List

Share
Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

Example 1:
Input: root = [4,2,6,1,3]
Output: 1

Example 2:
Input: root = [1,0,48,null,null,12,49]
Output: 1
 */
package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class MinDiffInBST {

    public int minDiffInBST(TreeNode root) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        helper(root, list);
        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            minDiff = Math.min(minDiff, (list.get(i + 1) - list.get(i)));
        }
        return minDiff;
    }

    public void helper(TreeNode node, ArrayList < Integer > list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.left == null && node.right == null) {
            return;
        }
        helper(node.left, list);
        helper(node.right, list);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}