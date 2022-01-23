/**
 * 606. Construct String from Binary Tree
Easy

1085

1453

Add to List

Share
Given the root of a binary tree, construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:
Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originallay it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"

Example 2:
Input: root = [1,2,3,null,4]
Output: "1(2()(4))(3)"
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 */
package leetcode.binary_tree;

public class Tree2str {

    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        if (t.left == null && t.right == null)
            return Integer.toString(t.val);
        if (t.right == null)
            return t.val + "(" + tree2str(t.left) + ")";
        return t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}