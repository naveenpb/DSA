package GreedyAlogrithum;
import java.util.Arrays;
import java.util.Comparator;
public class INTV__MaxChainLength {
    public static void main(String[] args) {
        // t(n) = ologn .......in momst of the greedy algorithms , whereever we use sorting we get ologn t(n) ... 
        int pairs[][] = {{5,25} , {39,60} ,{5,28} ,{27,40} ,{50,90}};
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        int chainno = 1;
        int pairend = pairs[0][1];
        System.out.print(pairs[0][0]+","+pairs[0][1]+ "->");
        for(int i = 0 ; i <pairs.length ; i++){
            if(pairs[i][0] > pairend){
                chainno++;
                System.out.print(pairs[i][0]+","+pairs[i][1]+ "->");
                
                pairend=pairs[i][1]; 
                // wwe can also print the chain , just store the values in a 2d array and print it at last 
            }
        }
        System.out.println();
    System.out.println("Max length is " + chainno);

    }
}
