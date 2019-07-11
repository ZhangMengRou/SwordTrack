package two;

import java.util.Stack;

public class MinStack_20 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();
    private int min = Integer.MAX_VALUE;
    public void push(int node) {
        min = Math.min(min,node);
        stack.push(node);
        stackMin.push(min);
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
        min = stackMin.peek();
    }

    public int top() {
        return stack.peek();
    }

    // 并不是说要把最小值从栈中移除，而是返回最小值
    public int min() {

        return stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack_20 t = new MinStack_20();
        t.push(3);
        System.out.println(t.min());
    }
}
