package Arraylist;

import java.util.ArrayList;

public class TwoPairRotated {
    static int  lp , rp ;

    public static boolean RotatedTwoPair(ArrayList<Integer> list , int target){
        for(int i = 0 ;i<list.size() ;i++){
            if(list.get(i) > list.get(i+1)){
                rp = i;
                lp = i+1;
                break; //REMEMBER YOU ALWAYS NEGLECT RETURN STATEMENT , EVEN IN RECURSSION AND  In IF STATEMENTS
            }
        }
        
        while (lp != rp ) {
            if(list.get(lp)+list.get(rp) == target){
                return true;
            } 

            else{
                if(list.get(lp)+list.get(rp) > target){
                    rp = (list.size()+rp-1)%list.size();
                }
                else{
                    lp = (lp+1) % list.size();
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
       ArrayList<Integer> height =  new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        int target = 16; 
        System.out.println(RotatedTwoPair(height,target));

    }
}
