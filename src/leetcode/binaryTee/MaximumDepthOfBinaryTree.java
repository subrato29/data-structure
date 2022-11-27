/**
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

Example 3:
Input: root = []
Output: 0

Example 4:
Input: root = [0]
Output: 1
 */

//TimeComplexity: O(n);
//SpaceComplexity: O(h);

package leetcode.binaryTee;

public class MaximumDepthOfBinaryTree {

	class BinaryTree {
		int value;
		BinaryTree left = null;
		BinaryTree right = null;
		
		BinaryTree(int value) {
			this.value = value;
		}
	}
	
	public static int maximumDepthOfBinaryTree(BinaryTree root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maximumDepthOfBinaryTree(root.left);
		int rightDepth = maximumDepthOfBinaryTree(root.right);
		
		return Math.max(leftDepth, rightDepth) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
