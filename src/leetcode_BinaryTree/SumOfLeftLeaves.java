package leetcode_BinaryTree;

/**
 * 404. Sum of Left Leaves
Easy

2013

187

Add to List

Share
Given the root of a binary tree, return the sum of all left leaves.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Example 2:
Input: root = [1]
Output: 0

https://www.youtube.com/watch?v=TzkfuLgpUxc
 */
public class SumOfLeftLeaves {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode (int val) {
			this.val = val;
		}
	}
	
	public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        if (root.right != null) {
            if (root.right.left != null || root.right.right != null) {
                sum += sumOfLeftLeaves(root.right);
            }
        }
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
