package Linkedlist;
import java.util.LinkedList;

public class LL_usingCollection {
    public static void main(String[] args) {
         LinkedList <Integer> l1 = new LinkedList<>();
        
         l1.add(0, null);
         l1.removeFirst();
         l1.add(4);
         l1.addLast(6);
         System.out.println(l1);
         System.out.println(l1.size());
         System.out.println(l1.size());
    }
}
