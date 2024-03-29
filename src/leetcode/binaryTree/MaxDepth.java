/**
 * 559. Maximum Depth of N-ary Tree
Easy

1487

62

Add to List

Share
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: 3

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: 5
 */
package leetcode.binaryTree;

import java.util.List;

public class MaxDepth {

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

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        for (Node child: root.children) {
            depth = Math.max(depth, maxDepth(child));
            System.out.println(depth);
        }
        return depth + 1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}