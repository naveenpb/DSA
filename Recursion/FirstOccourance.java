package Recursion;

public class FirstOccourance {
    public static int findfistoccourence(int arr[] , int key , int i ){
        // OHHHH bro you are doing a biggest mistake here , thats you cant declare the i in side the recursive function as it should return a new value every time
        
        if(i == arr.length ){
            return -1;
        }

        if(arr[i] == key ){
            return i;
        }
    
        return findfistoccourence(arr, key , i+1);
    }

    public static void main(String[] args) {
        // int arr[] = {'1','2','3','4','5'};
        // ohoooo lawde you have given string here give integer nonsense.
        int arr[] = {1,2,3,4,5};
        System.out.println(findfistoccourence(arr, 5,0));
    }
}
