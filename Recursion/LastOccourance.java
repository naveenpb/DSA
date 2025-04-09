package Recursion;

public class LastOccourance {
    public static int lastoccouur(int arr[] , int key  ,int i ){
        if(i == 0 ){
            return -1 ;
        }
        if(arr[i] == key){
            return i;
        }

        return lastoccouur(arr, key, i-1); 
        // REMBER I CANT GIVE I--- HERE WE HAVR TO GIVE I-1 ITSELF ..

    }  
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,4,3,6,8,5};
        System.out.println(lastoccouur(arr,6 , arr.length-1));
    }
}
