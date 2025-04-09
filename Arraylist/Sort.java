package Arraylist;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

// NOTE COLLECTIONS IS CLASS AND COLLECTION IS INTERFACE , WE HAVE TO USE COLLETIONS CLASS 

public class Sort {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//o(1)
        list.add(2,7);

        Collections.sort(list); //ASSECENDNING ORDER
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); // reverseorder is comparator
 
        System.out.println(list);
    }
}
