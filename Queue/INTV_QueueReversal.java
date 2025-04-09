package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class INTV_QueueReversal {

    public static void reverseQueue(Queue<Integer> q){
        int size = q.size();
        Stack<Integer> s = new Stack<>();
        for(int i  = 0 ; i < size ; i++){
            s.push(q.remove());
        }
// WE CAN ALSO USE WHILE ;LOOP BY ISING !ISEMPTY
        for(int i = 0 ; i < size ; i ++){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        reverseQueue(q);
       

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
