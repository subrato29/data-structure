/**
 * 589. N-ary Tree Preorder Traversal
Easy

1162

68

Add to List

Share
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 */
package leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

    class Node {
        public int val;
        public List < Node > children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List < Node > _children) {
            val = _val;
            children = _children;
        }
    }

    // solution
    public List < Integer > preorder(Node root) {
        List < Integer > list = new ArrayList < Integer > ();
        return helper(root, list);
    }

    public List < Integer > helper(Node node, List < Integer > list) {
        if (node != null) {
            list.add(node.val);
            for (Node child: node.children) {
                helper(child, list);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}