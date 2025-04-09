package Linkedlist;

public class Search {
    public static void search(int i) {
        if (i < 0 || i > Linklist.size - 1) {
            System.out.println("Invalid input");
            return;
        }
        if (i == 0) {
            System.out.println("Element in 1st pos is " + Linklist.head.data);
            return;
        }
        if (i == Linklist.size - 1) {
            System.out.println("Element found in " + (Linklist.size - 1) + "th position is " + Linklist.tail.data);
            return;
        }
       Linklist. Node temp = Linklist.head;
        int count = 0;
        while (count != i && temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Element in " + i + "th position is " + temp.data);
    }

    // SEARCH FOR ELEMENT IS IN WHICH POSITION
    public static void searchval(int key) {
        if (Linklist.head == null) {
            System.out.println("List is empty.");
            return;
        }

        Linklist.Node temp = Linklist.head;
        int count = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found in " + count + "th position");
                return;
            }
            temp = temp.next;
            count++;
        }

        // If not found
        System.out.println("Element not found in the list.");
    }


    // Search in recursive method ....
    

    public static int recuSearch(int key){
        return helper(Linklist.head,key);
    }

    public static int helper(Linklist.Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int indx = helper(head.next, key);
        if(indx == -1){
            return -1;
        }

        return indx+1;
    }
    
    
}
