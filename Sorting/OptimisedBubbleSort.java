package Sorting;

public class OptimisedBubbleSort {
    public static void bubbleee(int arr[]){
        int n  = arr.length;
        for(int i = 0 ; i <n-1 ; i++ ){
            boolean stopper = false;
            for(int j = 0 ; j < n-1-i ;j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp ; 
                    stopper= true;
                }
            }
            if(stopper==false){
                System.out.println("BC array is sorted");
                break;
            }
            
        }
        
    
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        bubbleee(arr);
        for(int i = 0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }

}
