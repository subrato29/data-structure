/**
 * 938. Range Sum of BST
Easy

2682

304

Add to List

Share
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

Example 1:
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
 */
package leetcode.binary_tree;

import java.util.ArrayList;

public class RangeSumBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        int sum = 0;
        helper(root, list, low, high);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public void helper(TreeNode node, ArrayList < Integer > list, int low, int high) {
        if (node == null) {
            return;
        }
        if (node.val >= low && node.val <= high) {
            list.add(node.val);
        }
        if (node.left == null && node.right == null) {
            return;
        }
        helper(node.left, list, low, high);
        helper(node.right, list, low, high);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}