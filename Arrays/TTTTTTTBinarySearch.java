package Arrays;
/*
 * 
 * 
 * 
 * VIMP NOTE : - WHERE VER IM GIVE TTTTTTT IN CLASS NAME THOSE PROGRAMS ARE TRICKY , OR IT MIGHT BE TRICKY TO UNDERSTAND FOR ME 
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
public class TTTTTTTBinarySearch {
    // we nead an sorted array as prerequeit , but here we are passing an sorted array itself for example
    public static int search(int arr[],int key){
        int first = 0;
        int last = arr.length-1;
        while (first <= last ) {
            int mid =(first +last )/2;
            if(arr[mid] ==key){
                return mid;
            }
            if(arr[mid]>mid){
                first = mid +1;
            }
            if(arr[mid]<mid){
                last =mid -1;
            }
        }

        return -1 ;
    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,14,6,7};
        int a =search(arr, 4);
        System.out.println("index of key is " + a);
    }

}
