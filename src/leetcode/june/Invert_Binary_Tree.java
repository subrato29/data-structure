package leetcode.june;

import javax.swing.tree.TreeNode;

public class Invert_Binary_Tree {

	/*
	public TreeNode invertTree(TreeNode root) {
	    if (root == null) {
	        return null;
	    }
	    TreeNode right = invertTree(root.right);
	    TreeNode left = invertTree(root.left);
	    root.left = right;
	    root.right = left;
	    return root;
	}
	*/
	
	/*
	public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        ListNode p = helper;
        helper.next = head;
        
        while(p.next !=null){
            if(p.next.val == val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return helper.next;
    }
    */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
