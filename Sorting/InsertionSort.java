package Sorting;

public class InsertionSort {
     public static void insertion(int arr[]){
        for(int i = 1 ; i<arr.length;i++){
            int currkey =arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > currkey){
                arr[prev+1] = arr[prev];
                prev -- ;
            }

            arr[prev+1] = currkey;                                       
        }


    }
     public static void main(String[] args) {
        int arr[] ={5,3,6,5,7,2,55};
        insertion(arr);
        int n =arr.length;
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i] +" ");
        }
     }
}
