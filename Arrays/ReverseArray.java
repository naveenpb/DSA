package Arrays;

public class ReverseArray {
    // see reversing an array is very simple if i used another array , and run an for loop backward front , but to reduce space and time complexity 
    // we have one optimal souln , which we are doing now
    public static void reverse(int arr[]){
       int  first = 0;
       int  last = arr.length-1;
        
        while(first < last){
            int temp = arr [first];
            arr[first] = arr[last];
            arr[last] = temp;
            first ++;
            last --;
        }

        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,14,6,7};
        reverse(arr);
    }
}
