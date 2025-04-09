package Arrays;

public class KadensSubArraySum{
    
    // it does the sub array sum in O(n) time complexity
    public static void kadens(int arr[]){
        int maxsum= Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0 ;i < arr.length;i++){
            currsum += arr[i];
            if(currsum<0){
                currsum = 0 ;
            }
            maxsum = Math.max(currsum,maxsum);
        }

        System.out.println("The max sum is = " + maxsum);
        
    }

    public static void negativekadens(int arr[]){
        int maxsum= Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0 ;i < arr.length;i++){
            currsum += Math.max(arr[i] , currsum+arr[i]);
        
            maxsum = Math.max(currsum,maxsum);
        }

        System.out.println("The max sum is = " + maxsum);
        
    }
    

    public static void main(String[] args) {
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadens(array);
        int arr[]={-2,-3,-4,-1,-4};
        negativekadens(arr);
    }
}
