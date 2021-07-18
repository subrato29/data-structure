/**
 * You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers.

A leaf node is a node with no children.

 

Example 1:


Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
Example 2:


Input: root = [4,9,0,5,1]
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
 */
package leetcode_BinaryTree;

import java.util.ArrayList;

public class SumRootToLeafNumbers {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public int sumNumbers(TreeNode root) {
        ArrayList < Integer > listOfSum = new ArrayList < Integer > ();
        int totSum = 0;
        sumNumberHelper(root, "0", listOfSum);
        for (int i = 0; i < listOfSum.size(); i++) {
            totSum = totSum + listOfSum.get(i);
        }
        return totSum;
    }

    public void sumNumberHelper(TreeNode node, String runningSum, ArrayList < Integer > sum) {
        if (node == null) {
            return;
        }
        runningSum = runningSum + String.valueOf(node.value);
        if (node.left == null && node.right == null) {
            sum.add(Integer.parseInt(runningSum));
            return;
        }
        sumNumberHelper(node.left, runningSum, sum);
        sumNumberHelper(node.right, runningSum, sum);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}