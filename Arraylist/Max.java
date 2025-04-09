package Arraylist;

import java.util.ArrayList;

public class Max {
    //O(N)
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//o(1)
        list.add(2,7); //O(N)
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<list.size();i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i)); //best Practice
        }

        System.out.println(max);
    }
}
