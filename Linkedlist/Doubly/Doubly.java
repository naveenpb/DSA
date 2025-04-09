package Linkedlist.Doubly;

public class Doubly {
    public class Node {
        int data;
        Node next ; 
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }     
    }

    public static Node head =  null;
    public static Node tail = null;
    public static int size = 0 ;

    public void addfirst(int data){
        Node newnode =  new Node(data);
        if(head == null){
            head = tail = newnode;
            head.next = tail.next = null;
            size++;
            return;
        }

        if(head == tail){
            head.next = newnode;
            newnode.prev = head;
            tail = newnode;
            tail.next = null;
            size++;
            return;
            
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
    }


    public void addlast(int data){
        Node newnode = new Node(data) ;
        if(head == null){
            head = tail = newnode;
            head.next = tail.next = null;
            size++;
            return;
        }

        if(head == tail){
            head.next = newnode;
            newnode.prev = head;
            tail = newnode;
            size++;
            return;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        tail.next = null;

    }

    // ALSO WRITE  REMOVE LOGIC IF YOU ARE FREE WHILEREADING THIS , 23-08-2024 ......... :-) , `.` , :)
    public void reverse(){
        Node curr = head ;
        Node prev = null;
        Node next ;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next; //this line is onlyy extra , than sll.

            prev = curr;
            curr = next;
        }

        head = prev; //optional 
    }
    public void printdll(){
        if(head == null){
            System.out.println("xxx");
            return;
        }

        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Doubly dll = new Doubly();
        dll.addfirst(2);
        dll.addlast(6);
        dll.printdll();
        System.out.println(size);
        dll.addfirst(4);
        dll.addlast(7);
        dll.printdll();
        dll.reverse();
        dll.printdll();
        

    }
}
