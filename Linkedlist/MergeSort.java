package Linkedlist;

public class MergeSort {

    public Linklist.Node merge(Linklist.Node head1, Linklist.Node head2) {
        Linklist.Node mergedLL = new Linklist.Node(-1); // Dummy node to start the merged list
        Linklist.Node temp = mergedLL;

        // Merge the two sorted lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append remaining elements of the non-empty list
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return mergedLL.next; // Return the merged list starting from the first real node
    }

    public Linklist.Node mergesortt(Linklist.Node head) {
        // Base case: If head is null or there is only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find the middle of the linked list
        Linklist.Node slow = head;
        Linklist.Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split the linked list into two halves
        Linklist.Node lefthead = head;
        Linklist.Node righthead = slow.next;
        slow.next = null; // Break the list into two parts at the mid-point

        // Step 3: Recursively sort both halves
        Linklist.Node newleft = mergesortt(lefthead);
        Linklist.Node newright = mergesortt(righthead);

        // Step 4: Merge the sorted halves
        return merge(newleft, newright);
    }

    public static void main(String[] args) {
        Linklist list = new Linklist();
        addto.addfirst(3);
        addto.addfirst(1);
        addto.addfirst(5);
        addto.addfirst(2);
        addto.addfirst(4);

        list.printLL();
        list.head= new MergeSort().mergesortt(list.head);
        list.printLL();
        
    }
}
