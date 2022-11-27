/**
 * Same Tree
Easy

3073

85

Add to List

Share
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false
 */

package leetcode.binaryTree;

public class IsSameTree {

    class BinaryTree {
        int value;
        BinaryTree left = null;
        BinaryTree right = null;

        BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean isSameTree(BinaryTree p, BinaryTree q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return (p.value == q.value) && (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}