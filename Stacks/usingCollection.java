package Stacks;
import java.util.Stack;

public class usingCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.pop();
        s.push(2);
        System.out.println(s.peek());
    }
}
