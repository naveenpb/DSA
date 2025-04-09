package Linkedlist;

public class INTV__RemoveCycle {

    public static void removeCycle() {
        Linklist.Node fast = Linklist.head;
        Linklist.Node slow = Linklist.head;
        boolean cycle = false;

        // Detect cycle using two-pointer technique
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) { // Cycle detected
                cycle = true;
                break;
            }
        }

        if (cycle == false) { //(!cycle)
            return; // No cycle found, nothing to remove
        }

        // Step 2: Find the start of the cycle
        slow = Linklist.head;
        Linklist.Node prev = null;

        // If the cycle is at the head itself
        if (fast == Linklist.head) {
            while (fast.next != Linklist.head) {
                fast = fast.next;
            }
            fast.next = null; // Remove the cycle
            return;
        }

        // Move both pointers until they meet at the start of the cycle
        while (slow != fast) {
            prev = fast; // Set `prev` before moving `fast`
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle by setting the previous node's next to null
        prev.next = null;
    }

    public static void main(String[] args) {
        // LinkedList initialization
        Linklist.head = new Linklist.Node(0);
        Linklist.head.next = new Linklist.Node(1);
        Linklist.head.next.next = new Linklist.Node(2);
        Linklist.head.next.next.next = Linklist.head; // Creating a cycle

        System.out.println(INTV__loopInLL.iscycle()); // Should return true
        removeCycle();
        System.out.println(INTV__loopInLL.iscycle()); // Should return false
    }
}
