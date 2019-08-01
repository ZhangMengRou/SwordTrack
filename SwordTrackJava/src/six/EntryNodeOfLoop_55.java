package six;

import tools.ListNode;

import java.util.HashSet;

public class EntryNodeOfLoop_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode q = pHead.next;
        ListNode s = pHead;
        while (q != null) {
            if (s == q) {
                break;
            }
            s = s.next;
            if (q.next == null) {
                q = null;
            } else {
                q = q.next.next;
            }
        }
        if (q == null) {
            return null;
        } else {
            ListNode tmp = q;
            set.add(tmp);
            q = q.next;

            while (q != s) {
                tmp = q;
                set.add(tmp);
                q = q.next;
            }
        }
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;
        System.out.println(new EntryNodeOfLoop_55().EntryNodeOfLoop(n1));
    }
}
