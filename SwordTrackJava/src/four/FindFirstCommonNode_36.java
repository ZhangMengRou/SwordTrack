package four;

import tools.ListNode;

import java.util.Stack;

public class FindFirstCommonNode_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getLen(pHead1);
        int len2 = getLen(pHead2);
        if (len1 > len2) {
            int k = len1 - len2;
            while (k > 0) {
                pHead1 = pHead1.next;
                k--;
            }
        } else {
            int k = len2 - len1;
            while (k > 0) {
                pHead2 = pHead2.next;
                k--;
            }
        }
        while (pHead1 != null && pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;


    }

    public int getLen(ListNode node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        return len;
    }
}
