package six;

import tools.ListNode;

import java.util.HashMap;

public class DeleteDuplication_56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode head = new ListNode(-1);

        ListNode tmp = pHead;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (tmp != null) {
            map.put(tmp.val, map.getOrDefault(tmp.val, 0) + 1);
            tmp = tmp.next;
        }

        tmp = pHead;
        ListNode tmpH = head;
        while (tmp != null) {
            if (map.get(tmp.val) > 1) {
                tmp = tmp.next;
                continue;
            }
            tmpH.next = new ListNode(tmp.val);
            tmp = tmp.next;
            tmpH = tmpH.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode a = new DeleteDuplication_56().deleteDuplication(n1);
        System.out.println(a.val);
    }
}
