package Linkedlist;

public class RemoveLL {
    // REMOVE FIRST
    public static void removefirst() {
        if (Linklist.size == 0) {
            System.out.println("Nothing is there in linked list");
            return;
        }
        if (Linklist.head == Linklist.tail) { // Only one element
            System.out.println("Removed item is " +Linklist. head.data);
            Linklist.head = Linklist.tail = null;
            Linklist.size--;
            return;
        }
        System.out.println("Removed item is " + Linklist.head.data);
       Linklist. head = Linklist.head.next;   
        Linklist.size--;
    }

    // REMOVE LAST
    public static void removelast() {
        if (Linklist.size == 0) {
            System.out.println("Nothing is there in linked list");
            return;
        }
        if (Linklist.head == Linklist.tail) { // Only one element
            System.out.println("Removed item is " +Linklist. head.data);
           Linklist. head =Linklist. tail = null;
            Linklist.size--;
            return;
        }

        Linklist.Node temp =Linklist. head;
        while (temp.next != Linklist.tail) {
            temp = temp.next;
        }
        System.out.println("Removed item is " + Linklist.tail.data);
        temp.next = null;
       Linklist. tail = temp;
       Linklist. size--;
    }



    public static void removeatindex(int i ){
        if(i <0 || i>Linklist.size-1){
            System.out.println("Invalid");
            return;
        }

        if (Linklist.head == Linklist.tail) { // Only one element
            System.out.println("Removed item is " +Linklist. head.data);
           Linklist. head =Linklist. tail = null;
            Linklist.size--;
            return;
        }

        if (Linklist.size == 0) {
            System.out.println("Nothing is there in linked list");
            return;
        }
        Linklist.Node prev = Linklist.head;
        Linklist.Node temp = Linklist.head.next;

        int count = 1 ;
        while (count != i) {
            temp = temp.next;
            prev = prev.next;
            count++;
        }

        prev.next = temp.next;




    }
}
