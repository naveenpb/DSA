package Arraylist;
import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer> list , int indx1 , int indx2)
    {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
       
    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//o(1)
        list.add(2,7);
        System.out.println(list);
        swap(list, 2, 0);
        System.out.println(list);
    }
}
