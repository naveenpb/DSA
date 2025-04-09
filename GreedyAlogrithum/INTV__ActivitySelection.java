package GreedyAlogrithum;

import java.util.*;


/*
 * 
 * here we have sorted 2d array using collection inferface ... please read about collection interface if time permits
 * 
 */

public class INTV__ActivitySelection {

    // t(n) = ologn
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // end time basis sorted here


        // but what if array is not sorted ;

        // we need to make a 2 d array and based on end time we need to sort that

        int activities[][] = new int[start.length][3];

        for(int i = 0 ; i < 0 ; i ++){
            activities[i][0] = i ; //index
            activities[i][1] = start[i];
            activities [i][2] = end[i];
        }

        // so we need to sort this on basis of end time

        // we use inbuilt function wiuth lamda operator

        Arrays.sort(activities, Comparator.comparingDouble(col -> col[2]));

        // now add actvities of [0] [0]; first and with the same logic add items to array ... but while adding remember its 2d array



        // 1st adctivity
        int maxacti = 0 ; 
        ArrayList <Integer> ans = new ArrayList<>();
        maxacti =1;
        ans.add(0);


        int lastend = end[0];
        for(int i  = 1 ;i <end.length ;i++){
            if(start[i] >= lastend ){
                maxacti ++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println("max activities = " + maxacti );

        System.out.println(ans);
          

    }
}
