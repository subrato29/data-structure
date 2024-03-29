package leetcode.binaryTree;

/**
 * 226. Invert Binary Tree
 * Easy
 * 10.3K
 * 142
 * Companies
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * Example 1:
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Example 2:
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 */

/**
 * The time complexity of the above recursive solution is O(n), where n is the total number of nodes in the binary tree.
 * The program requires O(h) extra space for the call stack, where h is the height of the tree.
 */
public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree (root.left);
        TreeNode right = invertTree (root.right);

        root.left = right;
        root.right = left;

        return root;
    }

}
