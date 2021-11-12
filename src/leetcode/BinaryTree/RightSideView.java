/**
 * 199. Binary Tree Right Side View
Medium

5202

286

Add to List

Share
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:
Input: root = [1,null,3]
Output: [1,3]

Example 3:
Input: root = []
Output: []
 */
package leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {


    //Time complexity: O(V + E)
    //Space complexity: O(V)
	//BFS
    public List < Integer > rightSideView(TreeNode root) {
        ArrayList < Integer > visibleValues = new ArrayList < Integer > ();
        if (root == null) {
            return visibleValues;
        }
        Queue < TreeNode > queue = new LinkedList < TreeNode > ();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if (i == size - 1) {
                    visibleValues.add(current.val);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return visibleValues;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}