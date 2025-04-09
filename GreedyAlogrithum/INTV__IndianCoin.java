package GreedyAlogrithum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class INTV__IndianCoin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin , Comparator.reverseOrder());//idu important .. else we will not get correct answer
        int countcoins = 0 ;
        int amount = 1046  ;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<coin.length ;i++){
            if(coin[i] <=amount){
                while (coin[i] <=amount) {
                    countcoins++;
                    a.add(coin[i]);
                    amount-= coin[i];
                }
            }
        }
        System.out.println(a);
        System.out.println(countcoins);
    }
}
