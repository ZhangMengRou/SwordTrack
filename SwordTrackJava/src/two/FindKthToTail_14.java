package two;

import tools.ListNode;

public class FindKthToTail_14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head==null||k<=0){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i =1;i<k;i++){
                fast = fast.next;
            if (fast==null){
                return null;
            }
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next =a3;
        System.out.println(new FindKthToTail_14().FindKthToTail( null,100));

    }
}
