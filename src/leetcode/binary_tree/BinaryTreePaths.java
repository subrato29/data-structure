/**
 * Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]
 */

package leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //Solution
    public List < String > binaryTreePaths(TreeNode root) {
        ArrayList < String > list = new ArrayList < String > ();
        binaryTreePathsHelper(root, "", list);
        return list;
    }

    public void binaryTreePathsHelper(TreeNode root, String element, ArrayList < String > list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            element += root.val;
            list.add(element);
            return;
        } else {
            element += root.val + "->";
        }
        binaryTreePathsHelper(root.left, element, list);
        binaryTreePathsHelper(root.right, element, list);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}