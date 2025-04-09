package Linkedlist;


/*
 * 
 * 
 * 
 * VIMP NOTE : - WHERE EVER IM GIVEN TTTTTTT IN CLASS NAME THOSE PROGRAMS ARE TRICKY , OR IT MIGHT BE TRICKY TO UNDERSTAND FOR ME 
 * OR I MIGHT MADE MISTAKE OR WRONG WHILE TYPING MY OWN CODE , OR MIGHT NOT LISTENEED TO LECTURE PROPERLY , SO REVISE THIS PARTICULAR TOPIC AND AGAIN..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */




//  ITS BETTER EXISTING ANSWER

public class TTTTTTTReverse {



    // O(N) == t(n)





    public static void reverse(){
        Linklist.Node prev =null;
        Linklist.Node curr =Linklist.tail = Linklist.head; //Important to put tail first
        Linklist.Node next ; // never intialize it first
    

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev =curr;
        curr = next;
    }

    Linklist.head = prev; //important , because current is now null by travesing :) so head will be prev
}
}
