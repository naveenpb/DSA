package Stacks;

public class UsingLL {
    public static class  Node {
        // STATIC INNER CLASS , SEE JAVA NOTES OR CHATGPT ONCE
        int data;
        Node next;
        // constructor
        public Node(int data){
            this.data =data;
            this.next = null;
        }   
    }

    public static class stack{
        static Node head  = null;
        // isempty
        public  boolean isEmpty(){
           return head==null;
        }
        // push
        public  void push(int  data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        // POP
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            Node temp =head;
            head = head.next;
            return temp.data;
        }

        public void peek(){
            if(isEmpty()){
                System.out.println("-1");
                return;
            }
            System.out.println(head.data);
        }

        public void print(){

            if(isEmpty()){
                System.out.println("BC stack is empty");
                return;
            }
            Node temp = head;
            while (temp!=null) {
                System.out.println("|"+temp.data+"|");
                temp = temp.next; 
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("----------------");
        s.pop();
        s.print();
        System.out.println("--------------");
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        s.print();
        
        

    }

}
