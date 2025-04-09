package Linkedlist;

public class addto {
    
    // ADD FIRST
    public static void addfirst(int data) {
    
        Linklist.Node newnode = new Linklist.Node(data);
         
        if (Linklist.head == null) {
            Linklist.head = Linklist.tail = newnode;
            Linklist.size++;
            return; // Important
        }

        newnode.next = Linklist.head;
        Linklist.head = newnode;
        Linklist.size++;
    }

    // ADD LAST
    public static void addlast(int data) {

        Linklist.Node newnode = new Linklist.Node(data);

        if (Linklist.head == null) {
            Linklist.head = Linklist.tail = newnode;
           Linklist. size++;
            return; // Important
        }

        Linklist.tail.next = newnode;
        Linklist.tail = newnode;
        Linklist.size++;
    }

    // ADD IN MIDDLE OR WHERE INDEX EQUALS
    public static void add(int indx, int data) {
        if (indx == 0) {
            addfirst(data);
            return;
        }

        if (indx == Linklist.size) {
            addlast(data);
            return;
        }

        Linklist.Node newnode = new Linklist.Node(data);
        Linklist.size++;

        Linklist.Node temp = Linklist.head;
        int i = 0;

        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    // ADD WHERE DATA EQUALS
    public static void addwhere(int data, int where) {
        Linklist.Node temp = Linklist.head;

        while (temp != null && temp.data != where) {
            temp = temp.next;
        }

        if (temp != null) {
            temp.data = data;
        } else {
            System.out.println("Element " + where + " not found in the list.");
        }
    }
}
