package Linkedlist;

public class INTV__loopInLL {
    public static boolean iscycle(){
        Linklist.Node fast = Linklist.head;
        Linklist.Node slow = Linklist.head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(slow == fast){
                return true;
            }
        }

        return false;

        // SOOOOO  TO CREATE A LL WITH LOOP , JUST CREATE ONE THREE NODE WITH SOME DATA , AND POINT LAST NODE IR(HEAD.NEXT.NEXT.NEXT) OR TAIL.NEXT TO HEAD AGAIN OR HEAD.NEXT AGAIN , IT WILL CREATE A LL WITH LOOP

    }
} 
