package Linkedlist;

public class printLL {
    // PRINT LINKED LIST
    public void print() {
        if (Linklist.head == null) {
            System.out.println("LL is empty");
            return;
        }
        Linklist.Node temp = Linklist.head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
