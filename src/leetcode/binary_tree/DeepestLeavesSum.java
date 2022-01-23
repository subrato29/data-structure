package leetcode.binary_tree;

import java.util.TreeMap;

import leetcode.binary_tree.BinaryTreePaths.TreeNode;

public class DeepestLeavesSum {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //Solution
    public int deepestLeavesSum(TreeNode root) {
        TreeMap < Integer, Integer > map = new TreeMap < Integer, Integer > ();
        helper(root, 0, 0, map);
        return map.get(map.lastKey());
    }

    public void helper(TreeNode node, int depth, int sum, TreeMap < Integer, Integer > map) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            map.put(depth, map.getOrDefault(depth, 0) + node.val);
            return;
        }
        helper(node.left, depth + 1, sum, map);
        helper(node.right, depth + 1, sum, map);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}