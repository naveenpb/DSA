package Linkedlist;

public class INTVRemovefromend {
    public static void removefromend(int i){
        Linklist.Node temp;
        temp = Linklist.head;
        int size = 0 ;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        
        RemoveLL.removeatindex(size-i);

    }
}
