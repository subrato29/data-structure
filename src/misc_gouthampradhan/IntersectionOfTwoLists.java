package misc_gouthampradhan;

public class IntersectionOfTwoLists {

	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode (int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur=headA;
        ListNode cur1=headB;
        int l1=0,l2=0;
        while(cur!=null)
        {
            cur=cur.next;
            l1++;
        }
         while(cur1!=null)
        {
            cur1=cur1.next;
            l2++;
        }
        cur=headA;
        cur1=headB;
        if(l1<l2)
        {
            while(l2!=l1&&cur1!=null)
            {
                cur1=cur1.next;
                l2--;
            }
            while(cur1!=null)
            {
                if(cur1==cur)
                {
                    return cur1;
                }
                cur1=cur1.next;
                cur=cur.next;
            }
            
          }else
            
         {
            while(l1!=l2&&cur!=null)
            {
                cur=cur.next;
                l1--;
            }
            while(cur!=null)
            {
                if(cur==cur1)
                {
                    return cur;
                }
                cur=cur.next;
                cur1=cur1.next;
            }
            
          }
        return null;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(2);
	    ListNode node2 = new ListNode(3);
	    node1.next = node2;
	    System.out.println(new IntersectionOfTwoLists().getIntersectionNode(node1, node2));
	}

}
