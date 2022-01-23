/**
 * 230. Kth Smallest Element in a BST
Medium

5048

101

Add to List

Share
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 */

//Time complexity: O(n)
//Space complexity: O(n)
package leetcode.binary_tree;

import java.util.ArrayList;

public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        inorder(root, list);
        return list.get(k - 1);
    }

    public void inorder(TreeNode root, ArrayList < Integer > list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}