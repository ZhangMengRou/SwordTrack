package two;

import tools.ListNode;


public class ReverseList_15 {
    public ListNode ReverseList(ListNode head) {

        if (head==null||head.next==null)
        {
            return head;
        }

        ListNode pre = null;
        while (head!=null){
            ListNode next = head.next;
            if (next==null){
                head.next = pre;
                return head;
            }
            head.next = pre;
            pre = head;
            head  = next;
        }
        return null;

    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next =a3;
        System.out.println(new ReverseList_15().ReverseList( a1));

    }
}
