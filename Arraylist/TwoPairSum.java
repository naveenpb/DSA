package Arraylist;

import java.util.ArrayList;

public class TwoPairSum {

    public static boolean Pairsum(ArrayList<Integer> list , int target){
        
        int i = 0 ;
        int j = list.size()-1;

        while(i<j){ // we can also use i!=j
            if(list.get(i) + list.get(j) == target){
                return true;
            }
            else{
                if(list.get(i) + list.get(j) > target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }

        return false;


    }

    public static void main(String[] args) {
        ArrayList<Integer> height =  new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        int target = 5;
        System.out.println(Pairsum(height, target));
    }
}
