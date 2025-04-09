package Stacks;

import java.util.Stack;

public class INTV__ReverseStack {

    public static void reversestack(Stack<Integer> stack){

        int top = stack.pop();
        reversestack(stack );
        INTV__PushAtBottom.pushatbottom(stack, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversestack(s);
    }
}
