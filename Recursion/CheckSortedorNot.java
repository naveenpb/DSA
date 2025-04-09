package Recursion;

public class CheckSortedorNot {
   public static boolean checksort(int arr[],int i){
       if(i == arr.length-1){
        return true;
       }
    //    if i goes till the last position
       if(arr[i] > arr[i+1]){
        return false ;
       }
    //    if i dosent fo till list return flase and getout.
       else{
       return checksort(arr, i+1);
       }
    }

   public static void main(String[] args) {
     int ar[] ={1,2,3,4,5};
     System.out.println(checksort(ar, 0));
   }

}
