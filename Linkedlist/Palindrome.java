package Linkedlist;

public class Palindrome {

    // FIND MID

    public static Linklist.Node findmid(Linklist.Node head){
        Linklist.Node fast = head;
        Linklist.Node slow = head;

        while (fast!=null && fast.next !=null) { //in both odd and even size case
            fast = fast.next.next;
            slow =slow.next;
        }

        return slow; //its my middle node
    }

    
    public static boolean Findpalindrome(Linklist.Node head){
        Linklist.Node curr = findmid(head);
        Linklist.Node prev = null;
        Linklist.Node next ;

        // REVERSE SECOND PART 
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Check With first part

        // so we will have head of both the part 

        Linklist.Node firstpart = Linklist.head , secondpart = prev;

        while(secondpart!= null){
            if(firstpart.data != secondpart.data){
                return false;
            }

            firstpart = firstpart.next;
            secondpart = secondpart.next;
        }
        return true;
    }

   
    

}
