/**
 * 653. Two Sum IV - Input is a BST
Easy

3260

193

Add to List

Share
Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Example 2:
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false
 */
package leetcode.BST;

import java.util.HashSet;

public class FindTarget {

    public boolean findTarget(TreeNode root, int k) {
        HashSet < Integer > set = new HashSet < Integer > ();
        return traverse(root, set, k);
    }

    public boolean traverse(TreeNode node, HashSet < Integer > set, int k) {
        if (node == null) {
            return false;
        }
        if (set.contains(k - node.val)) {
            return true;
        }
        set.add(node.val);
        return traverse(node.left, set, k) || traverse(node.right, set, k);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}