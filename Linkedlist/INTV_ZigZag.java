package Linkedlist;

public class INTV_ZigZag {
  

    public void zigzag(){
        // FIND MID
        Linklist.Node slow = Linklist.head;
        Linklist.Node fast = Linklist.head ;
        while(fast != null && fast.next!= null){
            fast =fast.next.next;
            slow=slow.next;
        }
        Linklist.Node mid = slow ;
       

        // reverse 2nd part

        Linklist.Node curr =  mid.next;
        mid.next = null;
        Linklist.Node prev = null;
        Linklist.Node next ;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;    
        }

    Linklist.Node lefthead = Linklist.head;

    Linklist.Node righthead = prev;

    Linklist.Node nextright , nextleft;

    while(lefthead != null && righthead != null ){
        nextleft = lefthead.next;
        lefthead.next = righthead;
        nextright = righthead.next;
        righthead.next = nextleft;

        lefthead = nextleft;
        righthead = nextright;
    }


    }
public static void main(String[] args) {
    Linklist list = new Linklist();
    addto.addfirst(3);
    addto.addfirst(1);
    addto.addfirst(5);
    addto.addfirst(2);
    addto.addfirst(4);

    list.printLL();
    INTV_ZigZag zig = new INTV_ZigZag();
    zig.zigzag();
    list.printLL();
}

}
