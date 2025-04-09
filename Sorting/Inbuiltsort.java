package Sorting;
import java.util.Arrays;//it will sort array in increasing order
import java.util.Collections; // to sort array in decending order , its not there in the normal array library , so we need to use collections

public class Inbuiltsort {
    public static void main(String[] args) {
        Integer arr[]={1,100,5,22,44,47,55,22};
        Arrays.sort(arr);
        Arrays.sort(arr , 0 ,3);
        // t(n) =O(n log n )
        
        /*
         *  -----vvvvimp------ 
         * we need to keep in mind that reverse ordeer sort dosent work with primitive data type
         * it only works wiht the objects , so we have created the arrray object of Integer class
         * reverse sort dosent work for primitive data type
         *  no problem in normmal sorting
         *          */
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());


        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
