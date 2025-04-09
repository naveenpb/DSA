package Arraylist;

import java.util.ArrayList;

public class Multidemintional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainlist.add(list);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2); 

        for(int i = 0 ;i<mainlist.size() ;i++){
            ArrayList<Integer> currlist = mainlist.get(i); //1st arraylist will be stored in currlist
            for(int j = 0 ; j <currlist.size();j++){ //currlist because the mainlist size is 2 , only 2 elements will be printed
                System.out.print(currlist.get(j));
            }
            System.out.println();
        }

        System.out.println(mainlist);

        // each arraylist in side arraylist can have varible size , its not madatory to have all internal arraylist of same size

        // 12345 // 1th table
        // 246810  //2nd table
        // 3691215 //3rd table 

        // see this problem once in video 9 , for last 4 minutes , its easy 

    }
}
