package one;

import tools.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class ListFromTailToHead_3 {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            ans.add(stack.pop());
        }
        return ans;

    }
}
