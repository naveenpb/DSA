package Linkedlist;

public class Linklist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;  // Ensure this is properly initialized
        }  
    }

    // HEAD AND TAIL
    public static Node head;
    public static Node tail;
    public static int size = 0;

    // PRINT LINKED LIST
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Linklist l1 = new Linklist();

        // Creating object is Most Preferd because each object refer to one linked list ....  
        

        // Adding elements
        addto.addfirst(0);
        l1.printLL();

        addto.addfirst(1);
        l1.printLL();

        addto.addfirst(2);
        l1.printLL();

        addto.addlast(3);
        l1.printLL();

        addto.addlast(4);
        l1.printLL();

        addto.addlast(5);
        l1.printLL();

        // Adding at specific position
        addto.add(0, 1);
        System.out.println("Size is " + size);
        l1.printLL();

        // Adding where specific data is found
        addto.addwhere(4, 2);
        l1.printLL();

        // Removing elements
        RemoveLL.removefirst();
        RemoveLL.removelast();
        l1.printLL();

        // Searching for elements by index
        Search.search(0);

        // Searching for elements by value
        Search.searchval(3);

        // Recusrive search

       System.out.println(Search.recuSearch(3)); 
       TTTTTTTReverse.reverse();
       l1.printLL();

       RemoveLL.removeatindex(2);
       l1.printLL();

       INTVRemovefromend.removefromend(2);
       l1.printLL();

       System.out.println(Palindrome.Findpalindrome(head));
       INTV__loopInLL.iscycle();
       addto.addlast(5);
       System.out.println(INTV__loopInLL.iscycle());


       
        
    }
}
