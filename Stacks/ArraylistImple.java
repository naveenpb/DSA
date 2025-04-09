package Stacks;
import java.util.*;;

public class ArraylistImple {
    static class stack{
        static ArrayList<Integer> list =  new ArrayList<>();
        
        
        public  boolean isEmpty(){
            return list.size() == 0;   
        }

        // push
        public  void push(int data){
            list.add(data);
        }

        // pop
        public int pop(){
            if(isEmpty() == true){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
           
        }

        public void peek(){
            System.out.println(list.get(list.size()-1));
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.peek();
        while (!s.isEmpty()) {
            s.peek();
            s.pop();
        }

    }
}
