package three;

import tools.RandomListNode;

public class RandomListNodeClone_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode pNode = pHead;
        while (pNode!=null){
            RandomListNode randomListNode = new RandomListNode(pNode.label);
            randomListNode.next = pNode.next;
            pNode.next = randomListNode;
            pNode = randomListNode.next;
        }

        pNode = pHead;
        while (pNode!=null){
            if (pNode.random!=null){
                pNode.next.random = pNode.random.next;
            }
            pNode = pNode.next.next;
        }

        pNode = pHead;
        RandomListNode ans = pNode.next;

        while (pNode!=null){
            RandomListNode pCloneNode = pNode.next;
            pNode.next = pCloneNode.next;
            pCloneNode.next = pCloneNode.next==null?null:pCloneNode.next.next;
            pNode = pNode.next;

        }
        return ans;
    }


    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node3;
        node2.random = node5;
        node4.random = node2;
        RandomListNode listNode = new RandomListNodeClone_25().Clone(node1);
        System.out.println(listNode+"-77--");
        while (listNode!=null){
            System.out.println(listNode.label);
            listNode = listNode.next;
        }
    }
}
