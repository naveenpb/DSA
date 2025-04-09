/*
 * 
 * 
 * 
 * VIMP NOTE : - WHERE EVER IM GIVEN TTTTTTT IN CLASS NAME THOSE PROGRAMS ARE TRICKY , OR IT MIGHT BE TRICKY TO UNDERSTAND FOR ME 
 * OR I MIGHT MADE MISTAKE OR WRONG WHILE TYPING MY OWN CODE , OR MIGHT NOT LISTENEED TO LECTURE PROPERLY , SO REVISE THIS PARTICULAR TOPIC AND AGAIN..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
package Sorting;

public class TTTTTTTTCountingSort {
    public static void counting(int arr[]){
        // we want to find the max number in array to make helper array , as we want to include all the integer numbers till the largest value in the helper array ,
        // so  find the largest first


        /*
         *
         * 
         *  HAVENT  UNDERSTOOD THIS PROOPERLY , I HAVE UNDERSTOOD THE PAPPER LOGIC BUT HAVENT UNDERSTOOD THE CODING LOGIC .
         * 
         * 
         * 
         */

        
        int largest = Integer.MIN_VALUE;
        for(int i =0 ;i <arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count [] =  new int[largest+1];
        // assuming +ve
        // here we have named helper array as count[] , and we have made largest +1 , because we also have to include 0 in our helper array
        for(int i = 0 ;i<arr.length;i++){
            count[arr[i]]++;
        }

        // SORTING
        int j  = 0;
        for(int i =0 ;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i ;
                j++;
                count[i]--;
           }
        }

    }

    public static void main(String[] args) {
        int a[] ={1,1,2,4,6,4,3,7};
        counting(a);
        
        BUbblesort.print(a);
    }
}
