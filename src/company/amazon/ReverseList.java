/**
 * 206. Reverse Linked List
Easy

9528

166

Add to List

Share
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
 */

package company.amazon;

public class ReverseList {
    //Time: O(n)
    //Space: O(1)
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode prevNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}