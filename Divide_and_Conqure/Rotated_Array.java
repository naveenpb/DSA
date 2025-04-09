package Divide_and_Conqure;

public class Rotated_Array {

public static int search(int arr[] , int target , int si , int ei){
    // if key is not in array
    // base case
    if(si>ei){

        return -1 ;
    }
    //  divide
    int mid = si +(ei-si)/2;
    
    // case found
    if(arr[mid] ==target){
        return mid;
    }

    //  supose target is on line 1

    if(arr[si] <= arr[mid]){
        // case a : left
        if(arr[si] <= target && target<=arr[mid]){
            return search(arr, target, si, mid-1);
        }
        else{
           return search(arr, target, mid +1 , ei);
        }
    } 
     
    //if not then it must be on line 2

    else{
        // case c :l2 right
        if(arr[mid]<=target && target<=arr[ei]){
            return search(arr, target, mid+1, ei);
        }

        else{
            return search(arr, target, si, mid-1);
        }
    }

}

    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target = 0; //output -->4
        int tarindx=search(arr, target, 0 ,arr.length-1);
        System.out.println(tarindx);
    }
}
