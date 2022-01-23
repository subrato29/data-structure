/**
 * 1022. Sum of Root To Leaf Binary Numbers
Easy

1420

101

Add to List

Share
You are given the root of a binary tree where each node has a value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.

For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.

Return the sum of these numbers. The answer is guaranteed to fit in a 32-bits integer.

Example 1:
Input: root = [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

Example 2:
Input: root = [0]
Output: 0

Example 3:
Input: root = [1]
Output: 1

Example 4:
Input: root = [1,1]
Output: 3
 */
package leetcode.binary_tree;

import java.util.ArrayList;

public class SumRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        helper(list, "", root);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public void helper(ArrayList < Integer > list, String element, TreeNode node) {
        if (node == null) {
            return;
        }
        element += node.val;
        if (node.left == null && node.right == null) {
            list.add(getDecimalFromBinary(element));
            return;
        }
        helper(list, element, node.left);
        helper(list, element, node.right);
    }

    public int getDecimalFromBinary(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}