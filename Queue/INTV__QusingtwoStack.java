package Queue;

import java.util.Stack;

public class INTV__QusingtwoStack {

    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 =  new Stack<>();

        // implement isempty first

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // implement add next O(n) , remaning all is opeartion is of O(1)
        public void add(int data){

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // implement remove next

        public void remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int a = s1.pop();
            System.out.println("Removed itemm is " + a);
        }

        // Implement peek next

        public int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args) {
       queue q  = new queue();
       q.add(0);
       q.add(2);
       q.add(3);
       q.add(5);
      
       while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
       }

    }
}
