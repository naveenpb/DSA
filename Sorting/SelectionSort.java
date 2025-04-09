package Sorting;

public class SelectionSort {
    public static void Selection(int arr[]){
        int n = arr.length ;
        // select the smallest element and push it at the begining
        for(int i =0 ;i<n-1;i++){
            int minpos= i;
            // here we want the positon in ehich the minimum is , we dont need the actual number
            for(int j = i +1 ;j <n ; j++  ){
                // we have taken minpos as i so no need to start j from 0 , ie the i will be 0
                if(arr[j] < arr[minpos]){
                    minpos =j;
                }
            }
            
            int temp = arr[minpos] ;
            arr[minpos] = arr[i];
            arr[i] = temp ;
        
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,3,6,5,7,2,55};
        Selection(arr);
        int n =arr.length;
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
