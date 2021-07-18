/**
 * 83. Remove Duplicates from Sorted List
Easy

2852

154

Add to List

Share
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */
package leetcode_linkedlist;

public class DeleteDuplicates {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //Solution
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextDistinctNode = currentNode.next;
            while (nextDistinctNode != null && currentNode.val == nextDistinctNode.val) {
                nextDistinctNode = nextDistinctNode.next;
            }
            //removing maching node and traversing to next;
            currentNode.next = nextDistinctNode;
            currentNode = nextDistinctNode;
        }
        return head;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}