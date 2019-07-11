package two;

import tools.ListNode;

public class MergeLinkList_16 {
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
            } else {
                ans.next = list2;
                list2 = list2.next;

            }
            ans = ans.next;
        }
        if (list1 != null) {
            ans.next = list1;
        }
        if (list2 != null) {
            ans.next = list2;
        }
        return head.next;
    }
}
