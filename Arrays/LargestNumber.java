package Arrays;

public class LargestNumber {
    public void Largest(int arr[]){
        int largest  = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest =arr[i];
            }
        }
        System.out.println("Largest " + largest);
        System.out.println("Smallest " + smallest);

    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
        int arr[] ={1,2,3,4,3,2,6,7,92,13};
        obj.Largest(arr);
    }
}
