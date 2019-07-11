package one;

import java.util.Stack;

public class QueuingWithTwoStacks_5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.empty()) {
            throw new Error("empty");
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {

    }
}
