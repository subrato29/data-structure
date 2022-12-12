package leetcode.linkedlist;

import leetcode.topInterviewQuestions.ListNode;

public class MergeTwoSortedLists_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode currNode = tempNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tempNode.next = l1;
                l1 = l1.next;
            } else {
                tempNode.next = l2;
                l2 = l2.next;
            }
            tempNode = tempNode.next;
        }
        if (l1 != null) {
            tempNode.next = l1;
        }
        if (l2 != null) {
            tempNode.next = l2;
        }
        return currNode.next;
    }

}
