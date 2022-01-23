/**
 * 965. Univalued Binary Tree
Easy

899

52

Add to List

Share
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:
Input: [1,1,1,1,1,null,1]
Output: true

Example 2:
Input: [2,2,2,5,2]
Output: false
 */
package leetcode.binary_tree;

import java.util.HashSet;
import java.util.Set;

public class IsUnivalTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Solution- 1
    public boolean isUnivalTree(TreeNode root) {
        Set < Integer > set = new HashSet();
        helper(root, set);
        if (set.size() > 1) {
            return false;
        }
        return true;
    }

    public void helper(TreeNode node, Set < Integer > set) {
        if (node == null) {
            return;
        }
        set.add(node.val);
        if (node.left == null && node.right == null) {
            return;
        }
        helper(node.left, set);
        helper(node.right, set);
    }

  //Solution- 2
    public boolean isUnivalTree_1(TreeNode root) {
       boolean left_bool = (root.left == null) || (root.left.val == root.val) && isUnivalTree(root.left);
       boolean right_bool = (root.right == null) || (root.right.val == root.val) && isUnivalTree(root.right);
       return left_bool && right_bool;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}