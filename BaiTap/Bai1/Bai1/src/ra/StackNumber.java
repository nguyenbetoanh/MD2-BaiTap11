package ra;

import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(65);
        System.out.println("mảng là : " +
                stack.pop() + stack.pop() + stack.pop() + stack.pop());
    }
}

