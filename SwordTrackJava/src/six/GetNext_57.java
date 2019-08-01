package six;

import tools.ListNode;
import tools.TreeLinkNode;

public class GetNext_57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            TreeLinkNode tmp = pNode.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            return tmp;
        } else {
            TreeLinkNode tmp = pNode;
            while (tmp.next != null) {
                if (tmp.next.left == tmp) {
                    return tmp.next;
                }
                tmp = tmp.next;

            }
            return null;
        }

    }
}
