package Arraylist;
import java.util.*;

public class Demo {
    // Part of java Collection framework
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//o(1)
        list.add(2,7); //o(n)
        System.out.println(list);//o(1)
        list.get(2);//O(1)
        list.remove(0); // O(n) because of resizing
        list.set(0, 1) ;//o(n)
        list.contains(2);

        // Size

        list.size(); //total lenth of arraylist
        for(int i = 0 ;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
    
}
